package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.GM;
import defpackage.Md5A;
import defpackage.ex0;
import defpackage.fc2;
import defpackage.iZUl;
import defpackage.kx5;
import defpackage.lx5;
import defpackage.mx5;
import defpackage.nx5;
import defpackage.od6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajg {
    public static int a(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(GM.a("Unknown content digest algorthm: ", i));
    }

    public static int b(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static String c(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(GM.a("Unknown content digest algorthm: ", i));
    }

    public static ByteBuffer d(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer e(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return d(byteBuffer, i);
        }
        StringBuilder sbC = iZUl.c("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ");
        sbC.append(byteBuffer.remaining());
        throw new IOException(sbC.toString());
    }

    public static void f(byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] g(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbC = iZUl.c("Underflow while reading length-prefixed value. Length: ", i, ", available: ");
        sbC.append(byteBuffer.remaining());
        throw new IOException(sbC.toString());
    }

    public static X509Certificate[] h(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferE = e(byteBuffer);
        ByteBuffer byteBufferE2 = e(byteBuffer);
        byte[] bArrG = g(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrG2 = null;
        int i = -1;
        int i2 = 0;
        byte[] bArrG3 = null;
        while (byteBufferE2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferE3 = e(byteBufferE2);
                if (byteBufferE3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferE3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iB = b(i3);
                    int iB2 = b(i);
                    if (iB != 1 && iB2 == 1) {
                    }
                }
                bArrG3 = g(byteBufferE3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(GM.a("Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrG));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferE);
            if (!signature.verify(bArrG3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferE.clear();
            ByteBuffer byteBufferE4 = e(byteBufferE);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferE4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferE5 = e(byteBufferE4);
                    if (byteBufferE5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferE5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrG2 = g(byteBufferE5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(GM.a("Failed to parse digest record #", i4), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iB3 = b(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iB3), bArrG2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrG2)) {
                throw new SecurityException(c(iB3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferE6 = e(byteBufferE);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferE6.hasRemaining()) {
                i6++;
                byte[] bArrG4 = g(byteBufferE6);
                try {
                    arrayList3.add(new nx5((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrG4)), bArrG4));
                } catch (CertificateException e3) {
                    throw new SecurityException(GM.a("Failed to decode certificate #", i6), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrG, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(fc2.a("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] i(int[] iArr, kx5[] kx5VarArr) throws DigestException {
        int i;
        long j;
        int length;
        String str;
        long j2 = 0;
        int i2 = 0;
        long jD = 0;
        while (true) {
            i = 3;
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jD += (kx5VarArr[i2].d() + 1048575) / 1048576;
            i2++;
        }
        if (jD >= 2097151) {
            throw new DigestException("Too many chunks: " + jD);
        }
        int i3 = (int) jD;
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(a(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            f(bArr2, i3);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i5 = 0;
        while (true) {
            str = " digest not supported";
            if (i5 >= iArr.length) {
                break;
            }
            String strC = c(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(strC);
                i5++;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strC.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i) {
            kx5 kx5Var = kx5VarArr[i6];
            int i9 = i7;
            String str2 = str;
            long jD2 = kx5Var.d();
            int i10 = i8;
            long j3 = j;
            long j4 = j2;
            while (jD2 > j2) {
                int iMin = (int) Math.min(jD2, j3);
                f(bArr3, iMin);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    kx5Var.c(messageDigestArr, j4, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int iA = a(i13);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr4, (i10 * iA) + 5, iA);
                        if (iDigest != iA) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i12++;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j5 = iMin;
                    j4 += j5;
                    jD2 -= j5;
                    i10++;
                    j2 = 0;
                    j3 = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(Md5A.e("Failed to digest chunk #", i10, " of section #", i9), e2);
                }
            }
            i7 = i9 + 1;
            i6++;
            j2 = 0;
            i = 3;
            j = 1048576;
            i8 = i10;
            str = str2;
        }
        String str3 = str;
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String strC2 = c(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(strC2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strC2.concat(str3), e3);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] j(FileChannel fileChannel, mx5 mx5Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferE = e(mx5Var.a);
                int i = 0;
                while (byteBufferE.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(h(e(byteBufferE), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(ex0.b("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = mx5Var.b;
                long j2 = mx5Var.c;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                lx5 lx5Var = new lx5(fileChannel, 0L, j);
                lx5 lx5Var2 = new lx5(fileChannel, j2, mx5Var.d - j2);
                ByteBuffer byteBufferDuplicate = mx5Var.e.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzajh.zzd(byteBufferDuplicate, j);
                od6 od6Var = new od6(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrI = i(iArr, new kx5[]{lx5Var, lx5Var2, od6Var});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrI[i3])) {
                            throw new SecurityException(c(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static X509Certificate[][] zza(String str) throws Throwable {
        Pair pairA;
        ?? r1 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairA = null;
            } else {
                pairA = zzajh.a(randomAccessFile, 0);
                if (pairA == null) {
                    pairA = zzajh.a(randomAccessFile, 65535);
                }
            }
            try {
                if (pairA == null) {
                    throw new zzajd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzajd("ZIP64 APK not supported");
                    }
                }
                long jZza = zzajh.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzajd("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (zzajh.zzb(byteBuffer) + jZza != jLongValue) {
                    throw new zzajd("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzajd("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ?? Allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                Allocate.order(byteOrder);
                randomAccessFile.seek(jZza - ((long) Allocate.capacity()));
                randomAccessFile.readFully(Allocate.array(), Allocate.arrayOffset(), Allocate.capacity());
                try {
                    if (Allocate.getLong(8) != 2334950737559900225L || Allocate.getLong(16) != 3617552046287187010L) {
                        throw new zzajd("No APK Signing Block before ZIP Central Directory");
                    }
                    try {
                        long j2 = Allocate.getLong(0);
                        if (j2 < Allocate.capacity() || j2 > 2147483639) {
                            throw new zzajd("APK Signing Block size out of range: " + j2);
                        }
                        int i = (int) (8 + j2);
                        long j3 = jZza - ((long) i);
                        if (j3 < 0) {
                            throw new zzajd("APK Signing Block offset out of range: " + j3);
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                        byteBufferAllocate.order(byteOrder);
                        Allocate = randomAccessFile;
                        Allocate.seek(j3);
                        Allocate.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                        long j4 = byteBufferAllocate.getLong(0);
                        if (j4 != j2) {
                            throw new zzajd("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                        }
                        Pair pairCreate = Pair.create(byteBufferAllocate, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                        long jLongValue2 = ((Long) pairCreate.second).longValue();
                        if (byteBuffer2.order() != byteOrder) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int iCapacity = byteBuffer2.capacity() - 24;
                        if (iCapacity < 8) {
                            throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                        }
                        int iCapacity2 = byteBuffer2.capacity();
                        if (iCapacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                        }
                        int iLimit = byteBuffer2.limit();
                        int iPosition = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iCapacity);
                            byteBuffer2.position(8);
                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                            byteBufferSlice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            int i2 = 0;
                            while (byteBufferSlice.hasRemaining()) {
                                i2++;
                                if (byteBufferSlice.remaining() < 8) {
                                    throw new zzajd("Insufficient data to read size of APK Signing Block entry #" + i2);
                                }
                                long j5 = byteBufferSlice.getLong();
                                if (j5 < 4 || j5 > 2147483647L) {
                                    throw new zzajd("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                }
                                int i3 = (int) j5;
                                int iPosition2 = byteBufferSlice.position() + i3;
                                if (i3 > byteBufferSlice.remaining()) {
                                    throw new zzajd("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                                }
                                if (byteBufferSlice.getInt() == 1896449818) {
                                    X509Certificate[][] x509CertificateArrJ = j(Allocate.getChannel(), new mx5(d(byteBufferSlice, i3 - 4), jLongValue2, jZza, jLongValue, byteBuffer));
                                    Allocate.close();
                                    try {
                                        Allocate.close();
                                    } catch (IOException unused) {
                                    }
                                    return x509CertificateArrJ;
                                }
                                byteBufferSlice.position(iPosition2);
                            }
                            throw new zzajd("No APK Signature Scheme v2 block in APK Signing Block");
                        } catch (Throwable th) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Allocate = randomAccessFile;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                r1 = Allocate;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r1 = randomAccessFile;
        }
        try {
            r1.close();
        } catch (IOException unused2) {
        }
        throw th;
    }
}

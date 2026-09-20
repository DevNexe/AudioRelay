package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaph {
    public static Cipher a;
    public static final Object b = new Object();
    public static final Object c = new Object();

    public zzaph(SecureRandom secureRandom) {
    }

    public static final Cipher a() {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzapg {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                a().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = a().doFinal(bArr2);
                iv = a().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return zzanm.zza(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new zzapg(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzapg(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzapg(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzapg(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzapg(this, e5);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzapg {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = zzanm.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new zzapg(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new zzapg(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzapg(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzapg(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzapg(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzapg(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzapg(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzapg(this, e7);
        }
    }
}

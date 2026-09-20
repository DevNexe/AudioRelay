package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfv extends zzep {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public zzfv(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfu(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = zzel.zza;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new zzfu("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfu {
        int identifier;
        long size;
        Uri uri = zzfaVar.zza;
        this.g = uri;
        boolean zEquals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.e;
        if (zEquals) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new zzfu("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new zzfu("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = resources.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.f);
            if (identifier == 0) {
                throw new zzfu("Resource not found.", null, 2005);
            }
        }
        b(zzfaVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new zzfu("Resource is compressed: ".concat(String.valueOf(uri)), null, AdError.SERVER_ERROR_CODE);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.i = fileInputStream;
            if (length != -1) {
                try {
                    if (zzfaVar.zzf > length) {
                        throw new zzfu(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (zzfu e) {
                    throw e;
                } catch (IOException e2) {
                    throw new zzfu(null, e2, AdError.SERVER_ERROR_CODE);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(zzfaVar.zzf + startOffset) - startOffset;
            if (jSkip != zzfaVar.zzf) {
                throw new zzfu(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.j = -1L;
                    size = -1;
                } else {
                    size = channel.size() - channel.position();
                    this.j = size;
                    if (size < 0) {
                        throw new zzfu(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                size = length - jSkip;
                this.j = size;
                if (size < 0) {
                    throw new zzew(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = zzfaVar.zzg;
            if (jMin != -1) {
                if (size != -1) {
                    jMin = Math.min(size, jMin);
                }
                this.j = jMin;
            }
            this.k = true;
            c(zzfaVar);
            long j = zzfaVar.zzg;
            return j != -1 ? j : this.j;
        } catch (Resources.NotFoundException e3) {
            throw new zzfu(null, e3, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.g;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.google.android.gms.internal.ads.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r5 = this;
            r0 = 0
            r5.g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.i     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.i = r0
            android.content.res.AssetFileDescriptor r3 = r5.h     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L21
            r5.k = r2
            r5.a()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzfu r4 = new com.google.android.gms.internal.ads.zzfu     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L36
            r5.k = r2
            r5.a()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzfu r4 = new com.google.android.gms.internal.ads.zzfu     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.i = r0
            android.content.res.AssetFileDescriptor r4 = r5.h     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L54
            r5.k = r2
            r5.a()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzfu r4 = new com.google.android.gms.internal.ads.zzfu     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 != 0) goto L65
            goto L6a
        L65:
            r5.k = r2
            r5.a()
        L6a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzd():void");
    }
}

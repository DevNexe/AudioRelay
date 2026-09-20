package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzes extends zzep {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzes(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzer {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzer(e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = zzel.zza;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzer {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = zzfaVar.zza;
                this.f = uri;
                b(zzfaVar);
                boolean zEquals = "content".equals(zzfaVar.zza.getScheme());
                ContentResolver contentResolver = this.e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: ".concat(String.valueOf(uri)));
                    i = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new zzer(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e) {
                        e = e;
                        if (true == (e instanceof FileNotFoundException)) {
                            i = 2005;
                        }
                        throw new zzer(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && zzfaVar.zzf > length) {
                    throw new zzer(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(zzfaVar.zzf + startOffset) - startOffset;
                if (jSkip != zzfaVar.zzf) {
                    throw new zzer(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new zzer(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.i = jPosition;
                    if (jPosition < 0) {
                        throw new zzer(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long jMin = zzfaVar.zzg;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.i = jMin;
                }
                this.j = true;
                c(zzfaVar);
                long j = zzfaVar.zzg;
                return j != -1 ? j : this.i;
            } catch (zzer e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = AdError.SERVER_ERROR_CODE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.f;
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
            r5.f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.h = r0
            android.content.res.AssetFileDescriptor r3 = r5.g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L21
            r5.j = r2
            r5.a()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzer r4 = new com.google.android.gms.internal.ads.zzer     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L36
            r5.j = r2
            r5.a()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzer r4 = new com.google.android.gms.internal.ads.zzer     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.h = r0
            android.content.res.AssetFileDescriptor r4 = r5.g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L54
            r5.j = r2
            r5.a()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzer r4 = new com.google.android.gms.internal.ads.zzer     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 != 0) goto L65
            goto L6a
        L65:
            r5.j = r2
            r5.a()
        L6a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzes.zzd():void");
    }
}

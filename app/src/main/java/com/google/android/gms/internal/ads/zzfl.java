package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import defpackage.fl6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfl extends zzep {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public zzfl() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfk {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = zzel.zza;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= (long) i4;
                zzg(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzfk(e, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfk {
        Uri uri = zzfaVar.zza;
        this.f = uri;
        b(zzfaVar);
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(zzfaVar.zzf);
                long length = zzfaVar.zzg;
                if (length == -1) {
                    length = this.e.length() - zzfaVar.zzf;
                }
                this.g = length;
                if (length < 0) {
                    throw new zzfk(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.h = true;
                c(zzfaVar);
                return this.g;
            } catch (IOException e) {
                throw new zzfk(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzfk(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            if (zzel.zza < 21 || !fl6.b(e2.getCause())) {
                i = 2005;
            }
            throw new zzfk(e2, i);
        } catch (SecurityException e3) {
            throw new zzfk(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new zzfk(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.f;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
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
            r1 = 0
            java.io.RandomAccessFile r2 = r5.e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.e = r0
            boolean r0 = r5.h
            if (r0 == 0) goto L16
            r5.h = r1
            r5.a()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfk r3 = new com.google.android.gms.internal.ads.zzfk     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.e = r0
            boolean r0 = r5.h
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.h = r1
            r5.a()
        L2e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.zzd():void");
    }
}

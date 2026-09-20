package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeo extends zzep {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zzeo(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzen {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzen(e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.g;
        int i3 = zzel.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzen {
        try {
            Uri uri = zzfaVar.zza;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(zzfaVar);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(zzfaVar.zzf) < zzfaVar.zzf) {
                throw new zzen(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j = zzfaVar.zzg;
            if (j != -1) {
                this.h = j;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            c(zzfaVar);
            return this.h;
        } catch (zzen e) {
            throw e;
        } catch (IOException e2) {
            throw new zzen(e2, true != (e2 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
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
            java.io.InputStream r2 = r5.g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.g = r0
            boolean r0 = r5.i
            if (r0 == 0) goto L16
            r5.i = r1
            r5.a()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzen r3 = new com.google.android.gms.internal.ads.zzen     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.g = r0
            boolean r0 = r5.i
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.i = r1
            r5.a()
        L2e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeo.zzd():void");
    }
}

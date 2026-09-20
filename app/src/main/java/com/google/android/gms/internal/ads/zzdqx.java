package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbo;
import defpackage.a42;
import defpackage.ft;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqx {
    public final zzbo a;
    public final ft b;
    public final Executor c;

    public zzdqx(zzbo zzboVar, ft ftVar, Executor executor) {
        this.a = zzboVar;
        this.b = ftVar;
        this.c = executor;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        ft ftVar = this.b;
        long jC = ftVar.c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jC2 = ftVar.c();
        if (bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j = jC2 - jC;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbA = a42.a("Decoded image w: ", width, " h:", height, " bytes: ");
            sbA.append(allocationByteCount);
            sbA.append(" time: ");
            sbA.append(j);
            sbA.append(" on ui thread: ");
            sbA.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final zzfyx zzb(String str, final double d, final boolean z) {
        return zzfyo.zzm(this.a.zza(str), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzdqx zzdqxVar = this.zza;
                double d2 = d;
                boolean z2 = z;
                zzdqxVar.getClass();
                byte[] bArr = ((zzajw) obj).zzb;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (d2 * 160.0d);
                if (!z2) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfg)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    zzdqxVar.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i = options.outWidth * options.outHeight;
                    if (i > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfh)).intValue())) / 2);
                    }
                }
                return zzdqxVar.a(bArr, options);
            }
        }, this.c);
    }
}

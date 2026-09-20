package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzcgg;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends com5Fixed {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzq[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        int i;
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int i2 = (int) (f / f2);
        if (i2 <= 400) {
            i = 32;
        } else {
            i = i2 <= 720 ? 50 : 90;
        }
        return (int) (i * f2);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.zza);
        Th.G(parcel, 3, this.zzb);
        Th.G(parcel, 4, this.zzc);
        Th.z(parcel, 5, this.zzd);
        Th.G(parcel, 6, this.zze);
        Th.G(parcel, 7, this.zzf);
        Th.M(parcel, 8, this.zzg, i);
        Th.z(parcel, 9, this.zzh);
        Th.z(parcel, 10, this.zzi);
        Th.z(parcel, 11, this.zzj);
        Th.z(parcel, 12, this.zzk);
        Th.z(parcel, 13, this.zzl);
        Th.z(parcel, 14, this.zzm);
        Th.z(parcel, 15, this.zzn);
        Th.z(parcel, 16, this.zzo);
        Th.X(parcel, iP);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    public zzq(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int i2;
        String str;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzb.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzb.zzg(adSize);
        boolean zZzh = com.google.android.gms.ads.zzb.zzh(adSize);
        this.zzo = zZzh;
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zza(adSize);
            this.zzb = height;
        } else if (zZzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        int i3 = this.zze;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i3 == -1) {
            zzaw.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzaw.zzb();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i4 = displayMetrics3.heightPixels;
                        int i5 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i6 = displayMetrics3.heightPixels;
                        int i7 = displayMetrics3.widthPixels;
                        if (i6 == i4 && i7 == i5) {
                            int i8 = displayMetrics.widthPixels;
                            zzaw.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                            dimensionPixelSize = i8 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.zze;
            zzaw.zzb();
            this.zzf = zzcgg.zzo(displayMetrics, this.zze);
        }
        if (height == -2) {
            int i9 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i2 = i9 <= 400 ? 32 : i9 <= 720 ? 50 : 90;
        } else {
            i2 = this.zzb;
        }
        zzaw.zzb();
        this.zzc = zzcgg.zzo(displayMetrics, i2);
        if (i3 == -1 || height == -2) {
            this.zza = i + "x" + i2 + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (zIsFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i10 = 0; i10 < adSizeArr.length; i10++) {
                this.zzg[i10] = new zzq(context, adSizeArr[i10]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzq(String str, int i, int i2, boolean z, int i3, int i4, zzq[] zzqVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}

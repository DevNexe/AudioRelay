package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnr;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends com5Fixed {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    public final boolean w;
    public final zzbz x;
    public final IBinder y;

    @Deprecated
    public static final class Builder {
        public ShouldDelayBannerRenderingListener a;

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.a = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.w = z;
        this.x = iBinder != null ? zzby.zzd(iBinder) : null;
        this.y = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 1, this.w);
        zzbz zzbzVar = this.x;
        Th.F(parcel, 2, zzbzVar == null ? null : zzbzVar.asBinder());
        Th.F(parcel, 3, this.y);
        Th.X(parcel, iP);
    }

    public final zzbz zza() {
        return this.x;
    }

    public final zzbnr zzb() {
        IBinder iBinder = this.y;
        if (iBinder == null) {
            return null;
        }
        return zzbnq.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.w;
    }
}

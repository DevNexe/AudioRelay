package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnr;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdViewOptions extends com5Fixed {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    public final boolean w;
    public final IBinder x;

    public static final class Builder {
        public boolean a = false;
        public ShouldDelayBannerRenderingListener b;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.b = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder) {
        this.w = builder.a;
        this.x = builder.b != null ? new zzfd(builder.b) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 1, getManualImpressionsEnabled());
        Th.F(parcel, 2, this.x);
        Th.X(parcel, iP);
    }

    public final zzbnr zza() {
        IBinder iBinder = this.x;
        if (iBinder == null) {
            return null;
        }
        return zzbnq.zzc(iBinder);
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.w = z;
        this.x = iBinder;
    }
}

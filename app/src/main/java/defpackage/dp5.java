package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class dp5 extends com5Fixed implements gq3 {
    public static final Parcelable.Creator<dp5> CREATOR = new mp5();
    public final int w;
    public final int x;
    public final Intent y;

    public dp5() {
        this(2, 0, null);
    }

    @Override // defpackage.gq3
    public final Status a() {
        return this.x == 0 ? Status.B : Status.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.G(parcel, 2, this.x);
        Th.I(parcel, 3, this.y, i);
        Th.X(parcel, iP);
    }

    public dp5(int i, int i2, Intent intent) {
        this.w = i;
        this.x = i2;
        this.y = intent;
    }
}

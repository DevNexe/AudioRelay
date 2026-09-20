package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l97 extends com5Fixed {
    public static final Parcelable.Creator<l97> CREATOR = new ba7();
    public final boolean w;

    @Nullable
    public final String x;
    public final int y;
    public final int z;

    public l97(int i, int i2, String str, boolean z) {
        this.w = z;
        this.x = str;
        this.y = Th.O(i) - 1;
        this.z = ac.p(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 1, this.w);
        Th.J(parcel, 2, this.x);
        Th.G(parcel, 3, this.y);
        Th.G(parcel, 4, this.z);
        Th.X(parcel, iP);
    }
}

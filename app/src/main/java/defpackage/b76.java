package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b76 extends com5Fixed {
    public static final Parcelable.Creator<b76> CREATOR = new cd6();
    public final String w;
    public final int x;

    public b76(String str, int i) {
        this.w = str;
        this.x = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.w);
        Th.G(parcel, 2, this.x);
        Th.X(parcel, iP);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class tr5 extends com5Fixed {
    public static final Parcelable.Creator<tr5> CREATOR = new u26();
    public final String w;
    public final String x;

    public tr5(String str, String str2) {
        this.w = str;
        this.x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.w);
        Th.J(parcel, 2, this.x);
        Th.X(parcel, iP);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sq5 extends com5Fixed implements gq3 {
    public static final Parcelable.Creator<sq5> CREATOR = new uq5();
    public final List<String> w;
    public final String x;

    public sq5(ArrayList arrayList, String str) {
        this.w = arrayList;
        this.x = str;
    }

    @Override // defpackage.gq3
    public final Status a() {
        return this.x != null ? Status.B : Status.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.L(parcel, 1, this.w);
        Th.J(parcel, 2, this.x);
        Th.X(parcel, iP);
    }
}

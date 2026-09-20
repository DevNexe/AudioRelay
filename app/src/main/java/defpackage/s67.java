package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class s67 extends com5Fixed {
    public static final Parcelable.Creator<s67> CREATOR = new k87();
    public final boolean A;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final Context z;

    public s67(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.w = str;
        this.x = z;
        this.y = z2;
        this.z = (Context) ObjectWrapper.M0(IObjectWrapper.Stub.L0(iBinder));
        this.A = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.w);
        Th.z(parcel, 2, this.x);
        Th.z(parcel, 3, this.y);
        Th.F(parcel, 4, new ObjectWrapper(this.z));
        Th.z(parcel, 5, this.A);
        Th.X(parcel, iP);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o06 extends com5Fixed implements Iterable<String> {
    public static final Parcelable.Creator<o06> CREATOR = new z06();
    public final Bundle w;

    public o06(Bundle bundle) {
        this.w = bundle;
    }

    public final Bundle b() {
        return new Bundle(this.w);
    }

    public final Double f() {
        return Double.valueOf(this.w.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new g06(this);
    }

    public final String toString() {
        return this.w.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.A(parcel, 2, b());
        Th.X(parcel, iP);
    }
}

package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.Th;
import defpackage.com5Fixed;
import defpackage.oa3;
import defpackage.ur5;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com5Fixed implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new ur5();
    public final int w;
    public final String x;

    public Scope() {
        throw null;
    }

    public Scope(int i, String str) {
        oa3.f("scopeUri must not be null or empty", str);
        this.w = i;
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.x.equals(((Scope) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.J(parcel, 2, this.x);
        Th.X(parcel, iP);
    }
}

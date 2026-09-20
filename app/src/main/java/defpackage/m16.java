package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m16 extends com5Fixed {
    public static final Parcelable.Creator<m16> CREATOR = new a26();
    public final String w;
    public final o06 x;
    public final String y;
    public final long z;

    public m16(m16 m16Var, long j) {
        oa3.h(m16Var);
        this.w = m16Var.w;
        this.x = m16Var.x;
        this.y = m16Var.y;
        this.z = j;
    }

    public final String toString() {
        return "origin=" + this.y + ",name=" + this.w + ",params=" + String.valueOf(this.x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a26.a(this, parcel, i);
    }

    public m16(String str, o06 o06Var, String str2, long j) {
        this.w = str;
        this.x = o06Var;
        this.y = str2;
        this.z = j;
    }
}

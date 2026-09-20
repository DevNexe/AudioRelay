package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d37 extends com5Fixed {
    public static final Parcelable.Creator<d37> CREATOR = new f37();
    public final String A;
    public final String B;
    public final Double C;
    public final int w;
    public final String x;
    public final long y;
    public final Long z;

    public d37(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.w = i;
        this.x = str;
        this.y = j;
        this.z = l;
        if (i == 1) {
            this.C = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.C = d;
        }
        this.A = str2;
        this.B = str3;
    }

    public final Object b() {
        Long l = this.z;
        if (l != null) {
            return l;
        }
        Double d = this.C;
        if (d != null) {
            return d;
        }
        String str = this.A;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f37.a(this, parcel);
    }

    public d37(h37 h37Var) {
        this(h37Var.d, h37Var.e, h37Var.c, h37Var.b);
    }

    public d37(long j, Object obj, String str, String str2) {
        oa3.e(str);
        this.w = 2;
        this.x = str;
        this.y = j;
        this.B = str2;
        if (obj == null) {
            this.z = null;
            this.C = null;
            this.A = null;
            return;
        }
        if (obj instanceof Long) {
            this.z = (Long) obj;
            this.C = null;
            this.A = null;
        } else if (obj instanceof String) {
            this.z = null;
            this.C = null;
            this.A = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.z = null;
                this.C = (Double) obj;
                this.A = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

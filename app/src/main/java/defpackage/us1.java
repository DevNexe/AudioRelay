package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us1 {
    public final Object a;
    public final Object b;

    public us1(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us1)) {
            return false;
        }
        us1 us1Var = (us1) obj;
        return ur1.a(this.a, us1Var.a) && ur1.a(this.b, us1Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i = iHashCode * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return o5.d(sb, this.b, ')');
    }
}

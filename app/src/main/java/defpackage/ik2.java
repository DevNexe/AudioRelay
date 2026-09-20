package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik2 {
    public final vl2<Object> a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public static final class QnHx {
        public vl2<Object> a;
        public boolean b;
    }

    public ik2(vl2 vl2Var, boolean z) {
        if (!(vl2Var.a || !z)) {
            throw new IllegalArgumentException((vl2Var.b() + " does not allow nullable values").toString());
        }
        this.a = vl2Var;
        this.b = z;
        this.d = null;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(ik2.class, obj.getClass())) {
            return false;
        }
        ik2 ik2Var = (ik2) obj;
        if (this.b != ik2Var.b || this.c != ik2Var.c || !ur1.a(this.a, ik2Var.a)) {
            return false;
        }
        Object obj2 = ik2Var.d;
        Object obj3 = this.d;
        if (obj3 != null) {
            return ur1.a(obj3, obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ik2.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        return sb.toString();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Z7jl implements CharSequence {
    public final String w;
    public final List<CQf<rq4>> x;
    public final List<CQf<bz2>> y;
    public final List<CQf<? extends Object>> z;

    public Z7jl() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z7jl(String str, List<CQf<rq4>> list, List<CQf<bz2>> list2, List<? extends CQf<? extends Object>> list3) {
        this.w = str;
        this.x = list;
        this.y = list2;
        this.z = list3;
        int size = list2.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            CQf<bz2> cQf = list2.get(i2);
            if (!(cQf.b >= i)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            int length = this.w.length();
            int i3 = cQf.c;
            if (!(i3 <= length)) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + cQf.b + ", " + i3 + ") is out of boundary").toString());
            }
            i2++;
            i = i3;
        }
    }

    public final Z7jl a(Z7jl z7jl) {
        QnHx qnHx = new QnHx(this);
        qnHx.b(z7jl);
        return qnHx.e();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Z7jl subSequence(int i, int i2) {
        if (i <= i2) {
            String str = this.w;
            return (i == 0 && i2 == str.length()) ? this : new Z7jl(str.substring(i, i2), oOd.a(i, i2, this.x), oOd.a(i, i2, this.y), oOd.a(i, i2, this.z));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.w.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z7jl)) {
            return false;
        }
        Z7jl z7jl = (Z7jl) obj;
        return ur1.a(this.w, z7jl.w) && ur1.a(this.x, z7jl.x) && ur1.a(this.y, z7jl.y) && ur1.a(this.z, z7jl.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + qg5.a(this.y, qg5.a(this.x, this.w.hashCode() * 31, 31), 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.w.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.w;
    }

    public static final class CQf<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        public CQf(T t, int i, int i2, String str) {
            this.a = t;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && this.b == cQf.b && this.c == cQf.c && ur1.a(this.d, cQf.d);
        }

        public final int hashCode() {
            T t = this.a;
            return this.d.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return bl2.c(sb, this.d, ')');
        }

        public CQf(int i, int i2, Object obj) {
            this(obj, i, i2, "");
        }
    }

    public static final class QnHx {
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        /* JADX INFO: renamed from: Z7jl$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0011QnHx<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public /* synthetic */ C0011QnHx(Object obj, int i, int i2, int i3) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : null);
            }

            public final CQf<T> a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new CQf<>(this.a, this.b, i, this.d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0011QnHx)) {
                    return false;
                }
                C0011QnHx c0011QnHx = (C0011QnHx) obj;
                return ur1.a(this.a, c0011QnHx.a) && this.b == c0011QnHx.b && this.c == c0011QnHx.c && ur1.a(this.d, c0011QnHx.d);
            }

            public final int hashCode() {
                T t = this.a;
                return this.d.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return bl2.c(sb, this.d, ')');
            }

            public C0011QnHx(T t, int i, int i2, String str) {
                this.a = t;
                this.b = i;
                this.c = i2;
                this.d = str;
            }
        }

        public QnHx() {
            this.a = new StringBuilder(16);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final void a(rq4 rq4Var, int i, int i2) {
            this.b.add(new C0011QnHx(rq4Var, i, i2, 8));
        }

        public final void b(Z7jl z7jl) {
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append(z7jl.w);
            List<CQf<rq4>> list = z7jl.x;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                CQf<rq4> cQf = list.get(i);
                a(cQf.a, cQf.b + length, cQf.c + length);
            }
            List<CQf<bz2>> list2 = z7jl.y;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                CQf<bz2> cQf2 = list2.get(i2);
                this.c.add(new C0011QnHx(cQf2.a, cQf2.b + length, cQf2.c + length, 8));
            }
            List<CQf<? extends Object>> list3 = z7jl.z;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                CQf<? extends Object> cQf3 = list3.get(i3);
                this.d.add(new C0011QnHx(cQf3.a, cQf3.b + length, cQf3.c + length, cQf3.d));
            }
        }

        public final void c(int i) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                while (arrayList.size() - 1 >= i) {
                    if (!(!arrayList.isEmpty())) {
                        throw new IllegalStateException("Nothing to pop.".toString());
                    }
                    ((C0011QnHx) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + arrayList.size()).toString());
        }

        public final int d(rq4 rq4Var) {
            C0011QnHx c0011QnHx = new C0011QnHx(rq4Var, this.a.length(), 0, 12);
            ArrayList arrayList = this.e;
            arrayList.add(c0011QnHx);
            this.b.add(c0011QnHx);
            return arrayList.size() - 1;
        }

        public final Z7jl e() {
            StringBuilder sb = this.a;
            String string = sb.toString();
            ArrayList arrayList = this.b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((C0011QnHx) arrayList.get(i)).a(sb.length()));
            }
            ArrayList arrayList3 = this.c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList4.add(((C0011QnHx) arrayList3.get(i2)).a(sb.length()));
            }
            ArrayList arrayList5 = this.d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList6.add(((C0011QnHx) arrayList5.get(i3)).a(sb.length()));
            }
            return new Z7jl(string, arrayList2, arrayList4, arrayList6);
        }

        public QnHx(Z7jl z7jl) {
            this();
            b(z7jl);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Z7jl(String str, List list, int i) {
        int i2 = i & 2;
        cs0 cs0Var = cs0.w;
        this(str, i2 != 0 ? cs0Var : list, (i & 4) != 0 ? cs0Var : null, cs0Var);
    }
}

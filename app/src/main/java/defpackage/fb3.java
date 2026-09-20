package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fb3 {
    public final boolean a;
    public final nj1<xq0<Throwable, db3>> b;
    public final nj1<ed3> c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final kj1<ab3> g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ab3 k;
    public final xa3 l;

    public fb3() {
        this(0);
    }

    public fb3(int i) {
        this(false, null, new nj1(ed3.d), null, false, false);
    }

    public static fb3 a(fb3 fb3Var, boolean z, nj1 nj1Var, String str, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = fb3Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            nj1Var = fb3Var.b;
        }
        nj1 nj1Var2 = nj1Var;
        nj1<ed3> nj1Var3 = (i & 4) != 0 ? fb3Var.c : null;
        if ((i & 8) != 0) {
            str = fb3Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z2 = fb3Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = fb3Var.f;
        }
        fb3Var.getClass();
        return new fb3(z4, nj1Var2, nj1Var3, str2, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb3)) {
            return false;
        }
        fb3 fb3Var = (fb3) obj;
        return this.a == fb3Var.a && ur1.a(this.b, fb3Var.b) && ur1.a(this.c, fb3Var.c) && ur1.a(this.d, fb3Var.d) && this.e == fb3Var.e && this.f == fb3Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        nj1<xq0<Throwable, db3>> nj1Var = this.b;
        int iHashCode = (this.c.hashCode() + ((i + (nj1Var == null ? 0 : nj1Var.hashCode())) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z2 = this.e;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode2 + r2) * 31;
        boolean z3 = this.f;
        return i2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        return "State(hasPurchaseRequestInProgress=" + this.a + ", plans=" + this.b + ", premiumTextsConfig=" + this.c + ", premiumScreenWarning=" + this.d + ", hasPendingPurchase=" + this.e + ", isRestoringPurchases=" + this.f + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [cs0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public fb3(boolean z, nj1<xq0<Throwable, db3>> nj1Var, nj1<ed3> nj1Var2, String str, boolean z2, boolean z3) {
        kj1<ab3> kj1Var;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? arrayList;
        xa3 f1;
        xa3 xa3Var;
        xq0<Throwable, db3> xq0Var;
        this.a = z;
        this.b = nj1Var;
        this.c = nj1Var2;
        this.d = str;
        this.e = z2;
        this.f = z3;
        ab3 ab3Var = null;
        if (nj1Var == null || (xq0Var = nj1Var.a) == null) {
            kj1Var = null;
        } else if (xq0Var instanceof xq0.CQf) {
            kj1Var = new kj1<>(((db3) ((xq0.CQf) xq0Var).a).d);
        } else {
            if (!(xq0Var instanceof xq0.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            kj1Var = null;
        }
        this.g = kj1Var;
        boolean z7 = false;
        if (kj1Var != null && !kj1Var.isEmpty()) {
            Iterator<ab3> it = kj1Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        this.h = z4;
        kj1<ab3> kj1Var2 = this.g;
        if (kj1Var2 != null && !kj1Var2.isEmpty()) {
            Iterator<ab3> it2 = kj1Var2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().a() instanceof n43.CQf) {
                        z5 = true;
                        break;
                    }
                } else {
                    z5 = false;
                    break;
                }
            }
        } else {
            z5 = false;
            break;
        }
        this.i = z5;
        kj1<ab3> kj1Var3 = this.g;
        if (kj1Var3 != null && !kj1Var3.isEmpty()) {
            Iterator<ab3> it3 = kj1Var3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z6 = false;
                    break;
                }
                ab3 next = it3.next();
                if (next.a && (next.a() instanceof n43.CQf)) {
                    z6 = true;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        this.j = z6;
        kj1<ab3> kj1Var4 = this.g;
        if (kj1Var4 != null) {
            for (ab3 ab3Var2 : kj1Var4) {
                if (ab3Var2.c) {
                    ab3Var = ab3Var2;
                    break;
                }
            }
            ab3Var = ab3Var;
        }
        this.k = ab3Var;
        if (ab3Var == null) {
            xa3Var = xa3.CQf.a;
        } else {
            boolean z8 = ab3Var.a() instanceof n43.CQf;
            kj1<ab3> kj1Var5 = this.g;
            if (kj1Var5 != null) {
                arrayList = new ArrayList();
                for (ab3 ab3Var3 : kj1Var5) {
                    ab3 ab3Var4 = ab3Var3;
                    if ((ab3Var4.a() instanceof n43.CQf) && ab3Var4.a) {
                        arrayList.add(ab3Var3);
                    }
                }
            } else {
                arrayList = cs0.w;
            }
            if (z8) {
                if (arrayList.contains(ab3Var)) {
                    xa3Var = xa3.CQf.a;
                } else {
                    Collection collection = (Collection) arrayList;
                    if (collection.size() == 1) {
                        f1 = new xa3.QnHx(ab3Var, ((ab3) wu.H0(arrayList)).f);
                    } else if (collection.size() > 1) {
                        xa3Var = xa3.CQf.a;
                    } else {
                        f1 = new xa3.LPt8Fixed(ab3Var);
                    }
                    xa3Var = f1;
                }
            } else if (ab3Var.a) {
                xa3Var = xa3.CQf.a;
            } else {
                kj1<ab3> kj1Var6 = this.g;
                if (kj1Var6 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ab3 ab3Var5 : kj1Var6) {
                        ab3 ab3Var6 = ab3Var5;
                        if ((ab3Var6.a() instanceof n43.CQf) && ab3Var6.a) {
                            arrayList2.add(ab3Var5);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (!((ab3) it4.next()).b) {
                                z7 = true;
                                break;
                            }
                        }
                    }
                } else {
                    z7 = this.j;
                }
                if (z7) {
                    f1 = new xa3.NUlFixed(ab3Var);
                } else {
                    f1 = new xa3.F1(ab3Var);
                }
                xa3Var = f1;
            }
        }
        this.l = xa3Var;
    }
}

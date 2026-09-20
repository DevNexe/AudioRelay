package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class db3 {
    public final kj1<n43> a;
    public final kj1<zg3> b;
    public final o43 c;
    public final kj1<ab3> d;

    public db3(kj1<n43> kj1Var, kj1<zg3> kj1Var2, o43 o43Var) {
        List listA;
        boolean z;
        boolean z2;
        boolean z3;
        zg3 next;
        List listE1;
        this.a = kj1Var;
        this.b = kj1Var2;
        this.c = o43Var;
        if (wu.B0(kj1Var2)) {
            if (kj1Var2.isEmpty()) {
                z = false;
                break;
            }
            Iterator<zg3> it = kj1Var2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a instanceof n43.QnHx) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                ArrayList arrayList = new ArrayList(mu.w0(kj1Var2, 10));
                for (zg3 zg3Var : kj1Var2) {
                    boolean z4 = zg3Var.b;
                    n43 n43Var = zg3Var.a;
                    arrayList.add(new ab3(true, z4, ur1.a(n43Var.a, o43Var), new nj1(n43Var.c), new nj1(n43Var)));
                }
                listA = a(arrayList);
            } else {
                if (kj1Var2.isEmpty()) {
                    z2 = false;
                    break;
                }
                Iterator<zg3> it2 = kj1Var2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!kj1Var.contains(it2.next().a)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    ArrayList arrayList2 = new ArrayList(mu.w0(kj1Var2, 10));
                    Iterator<zg3> it3 = kj1Var2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().a.c);
                    }
                    ArrayList arrayList3 = new ArrayList(mu.w0(kj1Var2, 10));
                    for (zg3 zg3Var2 : kj1Var2) {
                        boolean z5 = zg3Var2.b;
                        n43 n43Var2 = zg3Var2.a;
                        arrayList3.add(new ab3(true, z5, ur1.a(n43Var2.a, o43Var), new nj1(n43Var2.c), new nj1(n43Var2)));
                    }
                    ArrayList arrayList4 = new ArrayList(mu.w0(kj1Var2, 10));
                    Iterator<zg3> it4 = kj1Var2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(it4.next().a);
                    }
                    Collection collectionG = ddf.g(wu.h1(arrayList4), kj1Var);
                    if (collectionG.isEmpty()) {
                        listE1 = wu.e1(kj1Var);
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (n43 n43Var3 : kj1Var) {
                            if (!collectionG.contains(n43Var3)) {
                                arrayList5.add(n43Var3);
                            }
                        }
                        listE1 = arrayList5;
                    }
                    List listZ0 = wu.Z0(listE1, new cb3());
                    ArrayList<n43> arrayList6 = new ArrayList();
                    for (Object obj : listZ0) {
                        if (!arrayList2.contains(((n43) obj).c)) {
                            arrayList6.add(obj);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(mu.w0(arrayList6, 10));
                    for (n43 n43Var4 : arrayList6) {
                        arrayList7.add(new ab3(false, false, ur1.a(n43Var4.a, o43Var), new nj1(n43Var4.c), new nj1(n43Var4)));
                    }
                    listA = a(wu.Z0(wu.a1(wu.U0(arrayList7, arrayList3), 3), new bb3()));
                } else {
                    ArrayList arrayList8 = new ArrayList(mu.w0(kj1Var, 10));
                    for (n43 n43Var5 : kj1Var) {
                        if (kj1Var2.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        Iterator<zg3> it5 = kj1Var2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (ur1.a(it5.next().a, n43Var5)) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                z3 = false;
                                break;
                            }
                        }
                        Iterator<zg3> it6 = kj1Var2.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it6.next();
                        } while (!ur1.a(next.a, n43Var5));
                        zg3 zg3Var3 = next;
                        arrayList8.add(new ab3(z3, zg3Var3 != null ? zg3Var3.b : false, ur1.a(n43Var5.a, o43Var), new nj1(n43Var5.c), new nj1(n43Var5)));
                    }
                    listA = a(arrayList8);
                }
            }
        } else {
            ArrayList arrayList9 = new ArrayList(mu.w0(kj1Var, 10));
            for (n43 n43Var6 : kj1Var) {
                arrayList9.add(new ab3(false, false, ur1.a(n43Var6.a, o43Var), new nj1(n43Var6.c), new nj1(n43Var6)));
            }
            listA = a(arrayList9);
        }
        this.d = new kj1<>(listA);
    }

    public static List a(List list) {
        boolean z;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((ab3) it.next()).c) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            return list;
        }
        ab3 ab3Var = (ab3) list.get(0);
        return wu.U0(wu.D0(list2), Collections.singletonList(new ab3(ab3Var.a, ab3Var.b, true, ab3Var.d, ab3Var.e)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db3)) {
            return false;
        }
        db3 db3Var = (db3) obj;
        return ur1.a(this.a, db3Var.a) && ur1.a(this.b, db3Var.b) && ur1.a(this.c, db3Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        o43 o43Var = this.c;
        return iHashCode + (o43Var == null ? 0 : o43Var.hashCode());
    }

    public final String toString() {
        return "PlansUi(currentOffering=" + this.a + ", purchases=" + this.b + ", selection=" + this.c + ")";
    }
}

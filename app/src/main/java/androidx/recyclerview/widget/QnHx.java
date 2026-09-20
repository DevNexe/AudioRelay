package androidx.recyclerview.widget;

import defpackage.tp1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements LPt6Fixed.QnHx {
    public final InterfaceC0029QnHx d;
    public final tp1 a = new tp1(30, 2);
    public final ArrayList<CQf> b = new ArrayList<>();
    public final ArrayList<CQf> c = new ArrayList<>();
    public final LPt6Fixed e = new LPt6Fixed(this);

    public static class CQf {
        public int a;
        public int b;
        public Object c;
        public int d;

        public CQf(Object obj, int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CQf.class != obj.getClass()) {
                return false;
            }
            CQf cQf = (CQf) obj;
            int i = this.a;
            if (i != cQf.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == cQf.b && this.b == cQf.d) {
                return true;
            }
            if (this.d != cQf.d || this.b != cQf.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(cQf.c)) {
                    return false;
                }
            } else if (cQf.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.QnHx$QnHx, reason: collision with other inner class name */
    public interface InterfaceC0029QnHx {
    }

    public QnHx(Aa aa) {
        this.d = aa;
    }

    public final boolean a(int i) {
        ArrayList<CQf> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CQf cQf = arrayList.get(i2);
            int i3 = cQf.a;
            if (i3 == 8) {
                if (f(cQf.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = cQf.b;
                int i5 = cQf.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<CQf> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Aa) this.d).a(arrayList.get(i));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList<CQf> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CQf cQf = arrayList.get(i);
            int i2 = cQf.a;
            InterfaceC0029QnHx interfaceC0029QnHx = this.d;
            if (i2 == 1) {
                Aa aa = (Aa) interfaceC0029QnHx;
                aa.a(cQf);
                aa.d(cQf.b, cQf.d);
            } else if (i2 == 2) {
                Aa aa2 = (Aa) interfaceC0029QnHx;
                aa2.a(cQf);
                int i3 = cQf.b;
                int i4 = cQf.d;
                RecyclerView recyclerView = aa2.a;
                recyclerView.M(i3, i4, true);
                recyclerView.B0 = true;
                recyclerView.y0.c += i4;
            } else if (i2 == 4) {
                Aa aa3 = (Aa) interfaceC0029QnHx;
                aa3.a(cQf);
                aa3.c(cQf.b, cQf.d, cQf.c);
            } else if (i2 == 8) {
                Aa aa4 = (Aa) interfaceC0029QnHx;
                aa4.a(cQf);
                aa4.e(cQf.b, cQf.d);
            }
        }
        l(arrayList);
    }

    public final void d(CQf cQf) {
        int i;
        int i2 = cQf.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(cQf.b, i2);
        int i3 = cQf.b;
        int i4 = cQf.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + cQf);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < cQf.d; i6++) {
            int iM2 = m((i * i6) + cQf.b, cQf.a);
            int i7 = cQf.a;
            if (i7 == 2 ? iM2 == iM : i7 == 4 && iM2 == iM + 1) {
                i5++;
            } else {
                CQf cQfH = h(cQf.c, i7, iM, i5);
                e(cQfH, i3);
                k(cQfH);
                if (cQf.a == 4) {
                    i3 += i5;
                }
                iM = iM2;
                i5 = 1;
            }
        }
        Object obj = cQf.c;
        k(cQf);
        if (i5 > 0) {
            CQf cQfH2 = h(obj, cQf.a, iM, i5);
            e(cQfH2, i3);
            k(cQfH2);
        }
    }

    public final void e(CQf cQf, int i) {
        Aa aa = (Aa) this.d;
        aa.a(cQf);
        int i2 = cQf.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            aa.c(i, cQf.d, cQf.c);
        } else {
            int i3 = cQf.d;
            RecyclerView recyclerView = aa.a;
            recyclerView.M(i, i3, true);
            recyclerView.B0 = true;
            recyclerView.y0.c += i3;
        }
    }

    public final int f(int i, int i2) {
        ArrayList<CQf> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            CQf cQf = arrayList.get(i2);
            int i3 = cQf.a;
            if (i3 == 8) {
                int i4 = cQf.b;
                if (i4 == i) {
                    i = cQf.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (cQf.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = cQf.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = cQf.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += cQf.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final CQf h(Object obj, int i, int i2, int i3) {
        CQf cQf = (CQf) this.a.a();
        if (cQf == null) {
            return new CQf(obj, i, i2, i3);
        }
        cQf.a = i;
        cQf.b = i2;
        cQf.d = i3;
        cQf.c = obj;
        return cQf;
    }

    public final void i(CQf cQf) {
        this.c.add(cQf);
        int i = cQf.a;
        InterfaceC0029QnHx interfaceC0029QnHx = this.d;
        if (i == 1) {
            ((Aa) interfaceC0029QnHx).d(cQf.b, cQf.d);
            return;
        }
        if (i == 2) {
            int i2 = cQf.b;
            int i3 = cQf.d;
            RecyclerView recyclerView = ((Aa) interfaceC0029QnHx).a;
            recyclerView.M(i2, i3, false);
            recyclerView.B0 = true;
            return;
        }
        if (i == 4) {
            ((Aa) interfaceC0029QnHx).c(cQf.b, cQf.d, cQf.c);
        } else if (i == 8) {
            ((Aa) interfaceC0029QnHx).e(cQf.b, cQf.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + cQf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    public final void j() {
        int i;
        boolean z;
        byte b;
        CQf cQfH;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<CQf> arrayList = this.b;
        LPt6Fixed lPt6 = this.e;
        lPt6.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            CQf cQfH2 = null;
            if (size == -1) {
                break;
            }
            int i5 = size + 1;
            CQf cQf = arrayList.get(size);
            CQf cQf2 = arrayList.get(i5);
            int i6 = cQf2.a;
            if (i6 != 1) {
                LPt6Fixed.QnHx qnHx = lPt6.a;
                if (i6 == 2) {
                    int i7 = cQf.b;
                    int i8 = cQf.d;
                    if (i7 < i8) {
                        if (cQf2.b == i7 && cQf2.d == i8 - i7) {
                            z4 = false;
                            z3 = z4;
                            z2 = true;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    } else if (cQf2.b == i8 + 1 && cQf2.d == i7 - i8) {
                        z4 = true;
                        z3 = z4;
                        z2 = true;
                    } else {
                        z2 = false;
                        z3 = true;
                    }
                    int i9 = cQf2.b;
                    if (i8 < i9) {
                        cQf2.b = i9 - 1;
                    } else {
                        int i10 = cQf2.d;
                        if (i8 < i9 + i10) {
                            cQf2.d = i10 - 1;
                            cQf.a = 2;
                            cQf.d = 1;
                            if (cQf2.d == 0) {
                                arrayList.remove(i5);
                                ((QnHx) qnHx).k(cQf2);
                            }
                        }
                    }
                    int i11 = cQf.b;
                    int i12 = cQf2.b;
                    if (i11 <= i12) {
                        cQf2.b = i12 + 1;
                    } else {
                        int i13 = i12 + cQf2.d;
                        if (i11 < i13) {
                            cQfH2 = ((QnHx) qnHx).h(null, 2, i11 + 1, i13 - i11);
                            cQf2.d = cQf.b - cQf2.b;
                        }
                    }
                    if (z2) {
                        arrayList.set(size, cQf2);
                        arrayList.remove(i5);
                        ((QnHx) qnHx).k(cQf);
                    } else {
                        if (z3) {
                            if (cQfH2 != null) {
                                int i14 = cQf.b;
                                if (i14 > cQfH2.b) {
                                    cQf.b = i14 - cQfH2.d;
                                }
                                int i15 = cQf.d;
                                if (i15 > cQfH2.b) {
                                    cQf.d = i15 - cQfH2.d;
                                }
                            }
                            int i16 = cQf.b;
                            if (i16 > cQf2.b) {
                                cQf.b = i16 - cQf2.d;
                            }
                            int i17 = cQf.d;
                            if (i17 > cQf2.b) {
                                cQf.d = i17 - cQf2.d;
                            }
                        } else {
                            if (cQfH2 != null) {
                                int i18 = cQf.b;
                                if (i18 >= cQfH2.b) {
                                    cQf.b = i18 - cQfH2.d;
                                }
                                int i19 = cQf.d;
                                if (i19 >= cQfH2.b) {
                                    cQf.d = i19 - cQfH2.d;
                                }
                            }
                            int i20 = cQf.b;
                            if (i20 >= cQf2.b) {
                                cQf.b = i20 - cQf2.d;
                            }
                            int i21 = cQf.d;
                            if (i21 >= cQf2.b) {
                                cQf.d = i21 - cQf2.d;
                            }
                        }
                        arrayList.set(size, cQf2);
                        if (cQf.b != cQf.d) {
                            arrayList.set(i5, cQf);
                        } else {
                            arrayList.remove(i5);
                        }
                        if (cQfH2 != null) {
                            arrayList.add(size, cQfH2);
                        }
                    }
                } else if (i6 == 4) {
                    int i22 = cQf.d;
                    int i23 = cQf2.b;
                    if (i22 < i23) {
                        cQf2.b = i23 - 1;
                    } else {
                        int i24 = cQf2.d;
                        if (i22 < i23 + i24) {
                            cQf2.d = i24 - 1;
                            cQfH = ((QnHx) qnHx).h(cQf2.c, 4, cQf.b, 1);
                        }
                        i2 = cQf.b;
                        i3 = cQf2.b;
                        if (i2 <= i3) {
                            cQf2.b = i3 + 1;
                        } else {
                            i4 = i3 + cQf2.d;
                            if (i2 < i4) {
                                int i25 = i4 - i2;
                                cQfH2 = ((QnHx) qnHx).h(cQf2.c, 4, i2 + 1, i25);
                                cQf2.d -= i25;
                            }
                        }
                        arrayList.set(i5, cQf);
                        if (cQf2.d > 0) {
                            arrayList.set(size, cQf2);
                        } else {
                            arrayList.remove(size);
                            ((QnHx) qnHx).k(cQf2);
                        }
                        if (cQfH != null) {
                            arrayList.add(size, cQfH);
                        }
                        if (cQfH2 != null) {
                            arrayList.add(size, cQfH2);
                        }
                    }
                    cQfH = null;
                    i2 = cQf.b;
                    i3 = cQf2.b;
                    if (i2 <= i3) {
                        cQf2.b = i3 + 1;
                    } else {
                        i4 = i3 + cQf2.d;
                        if (i2 < i4) {
                            int i26 = i4 - i2;
                            cQfH2 = ((QnHx) qnHx).h(cQf2.c, 4, i2 + 1, i26);
                            cQf2.d -= i26;
                        }
                    }
                    arrayList.set(i5, cQf);
                    if (cQf2.d > 0) {
                        arrayList.set(size, cQf2);
                    } else {
                        arrayList.remove(size);
                        ((QnHx) qnHx).k(cQf2);
                    }
                    if (cQfH != null) {
                        arrayList.add(size, cQfH);
                    }
                    if (cQfH2 != null) {
                        arrayList.add(size, cQfH2);
                    }
                }
            } else {
                int i27 = cQf.d;
                int i28 = cQf2.b;
                int i29 = i27 < i28 ? -1 : 0;
                int i30 = cQf.b;
                if (i30 < i28) {
                    i29++;
                }
                if (i28 <= i30) {
                    cQf.b = i30 + cQf2.d;
                }
                int i31 = cQf2.b;
                if (i31 <= i27) {
                    cQf.d = i27 + cQf2.d;
                }
                cQf2.b = i31 + i29;
                arrayList.set(size, cQf2);
                arrayList.set(i5, cQf);
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            CQf cQfH3 = arrayList.get(i32);
            int i33 = cQfH3.a;
            if (i33 != 1) {
                InterfaceC0029QnHx interfaceC0029QnHx = this.d;
                if (i33 == 2) {
                    int i34 = cQfH3.b;
                    int i35 = cQfH3.d + i34;
                    int i36 = i34;
                    int i37 = 0;
                    byte b2 = -1;
                    while (i36 < i35) {
                        if (((Aa) interfaceC0029QnHx).b(i36) != null || a(i36)) {
                            if (b2 == 0) {
                                d(h(null, 2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                i(h(null, 2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b2 = b;
                    }
                    if (i37 != cQfH3.d) {
                        k(cQfH3);
                        cQfH3 = h(null, 2, i34, i37);
                    }
                    if (b2 == 0) {
                        d(cQfH3);
                    } else {
                        i(cQfH3);
                    }
                } else if (i33 == 4) {
                    int i38 = cQfH3.b;
                    int i39 = cQfH3.d + i38;
                    int i40 = i38;
                    int i41 = 0;
                    byte b3 = -1;
                    while (i38 < i39) {
                        if (((Aa) interfaceC0029QnHx).b(i38) != null || a(i38)) {
                            if (b3 == 0) {
                                d(h(cQfH3.c, 4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                i(h(cQfH3.c, 4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != cQfH3.d) {
                        Object obj = cQfH3.c;
                        k(cQfH3);
                        cQfH3 = h(obj, 4, i40, i41);
                    }
                    if (b3 == 0) {
                        d(cQfH3);
                    } else {
                        i(cQfH3);
                    }
                } else if (i33 == i) {
                    i(cQfH3);
                }
            } else {
                i(cQfH3);
            }
            i32++;
            i = 8;
        }
        arrayList.clear();
    }

    public final void k(CQf cQf) {
        cQf.c = null;
        this.a.f(cQf);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((CQf) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        ArrayList<CQf> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CQf cQf = arrayList.get(size);
            int i5 = cQf.a;
            if (i5 == 8) {
                int i6 = cQf.b;
                int i7 = cQf.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            cQf.b = i6 + 1;
                            cQf.d = i7 + 1;
                        } else if (i2 == 2) {
                            cQf.b = i6 - 1;
                            cQf.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        cQf.d = i7 + 1;
                    } else if (i2 == 2) {
                        cQf.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        cQf.b = i6 + 1;
                    } else if (i2 == 2) {
                        cQf.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = cQf.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= cQf.d;
                    } else if (i5 == 2) {
                        i += cQf.d;
                    }
                } else if (i2 == 1) {
                    cQf.b = i8 + 1;
                } else if (i2 == 2) {
                    cQf.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            CQf cQf2 = arrayList.get(size2);
            if (cQf2.a == 8) {
                int i9 = cQf2.d;
                if (i9 == cQf2.b || i9 < 0) {
                    arrayList.remove(size2);
                    k(cQf2);
                }
            } else if (cQf2.d <= 0) {
                arrayList.remove(size2);
                k(cQf2);
            }
        }
        return i;
    }
}

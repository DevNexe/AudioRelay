package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 {
    public final f70 a;
    public final f70 d;
    public f9.CQf f;
    public final f9.QnHx g;
    public final ArrayList<zu3> h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList<cm5> e = new ArrayList<>();

    public oj0(f70 f70Var) {
        new ArrayList();
        this.f = null;
        this.g = new f9.QnHx();
        this.h = new ArrayList<>();
        this.a = f70Var;
        this.d = f70Var;
    }

    public final void a(qj0 qj0Var, int i, int i2, ArrayList arrayList, zu3 zu3Var) {
        cm5 cm5Var = qj0Var.d;
        if (cm5Var.c == null) {
            f70 f70Var = this.a;
            if (cm5Var == f70Var.d || cm5Var == f70Var.e) {
                return;
            }
            if (zu3Var == null) {
                zu3Var = new zu3(cm5Var);
                arrayList.add(zu3Var);
            }
            cm5Var.c = zu3Var;
            zu3Var.b.add(cm5Var);
            qj0 qj0Var2 = cm5Var.h;
            for (lj0 lj0Var : qj0Var2.k) {
                if (lj0Var instanceof qj0) {
                    a((qj0) lj0Var, i, 0, arrayList, zu3Var);
                }
            }
            qj0 qj0Var3 = cm5Var.i;
            for (lj0 lj0Var2 : qj0Var3.k) {
                if (lj0Var2 instanceof qj0) {
                    a((qj0) lj0Var2, i, 1, arrayList, zu3Var);
                }
            }
            if (i == 1 && (cm5Var instanceof wh5)) {
                for (lj0 lj0Var3 : ((wh5) cm5Var).k.k) {
                    if (lj0Var3 instanceof qj0) {
                        a((qj0) lj0Var3, i, 2, arrayList, zu3Var);
                    }
                }
            }
            Iterator it = qj0Var2.l.iterator();
            while (it.hasNext()) {
                a((qj0) it.next(), i, 0, arrayList, zu3Var);
            }
            Iterator it2 = qj0Var3.l.iterator();
            while (it2.hasNext()) {
                a((qj0) it2.next(), i, 1, arrayList, zu3Var);
            }
            if (i == 1 && (cm5Var instanceof wh5)) {
                Iterator it3 = ((wh5) cm5Var).k.l.iterator();
                while (it3.hasNext()) {
                    a((qj0) it3.next(), i, 2, arrayList, zu3Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0239 A[DONT_INVERT, PHI: r0 r2
  0x0239: PHI (r0v12 int) = (r0v11 int), (r0v29 int), (r0v11 int) binds: [B:95:0x017e, B:121:0x021a, B:98:0x0183] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r2v7 int) = (r2v6 int), (r2v16 int), (r2v6 int) binds: [B:95:0x017e, B:121:0x021a, B:98:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0282  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[PHI: r0
  0x00b7: PHI (r0v9 int) = (r0v7 int), (r0v72 int) binds: [B:64:0x00b3, B:58:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x0180  */
    public final void b(f70 f70Var) {
        int i;
        int iJ;
        int iJ2;
        int iG;
        int iG2;
        int i2;
        zk0 zk0Var;
        zk0 zk0Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        f70 f70Var2 = f70Var;
        for (e70 e70Var : f70Var.e0) {
            int[] iArr = e70Var.J;
            int i8 = iArr[0];
            int i9 = iArr[1];
            if (e70Var.X == 8) {
                e70Var.a = true;
            } else {
                float f = e70Var.o;
                if (f < 1.0f && i8 == 3) {
                    e70Var.j = 2;
                }
                float f2 = e70Var.r;
                if (f2 < 1.0f && i9 == 3) {
                    e70Var.k = 2;
                }
                if (e70Var.N > 0.0f) {
                    if (i8 == 3 && (i9 == 2 || i9 == 1)) {
                        e70Var.j = 3;
                    } else if (i9 == 3 && (i8 == 2 || i8 == 1)) {
                        e70Var.k = 3;
                    } else if (i8 == 3 && i9 == 3) {
                        if (e70Var.j == 0) {
                            e70Var.j = 3;
                        }
                        if (e70Var.k == 0) {
                            e70Var.k = 3;
                        }
                    }
                }
                w60 w60Var = e70Var.A;
                w60 w60Var2 = e70Var.y;
                if (i8 == 3 && e70Var.j == 1 && (w60Var2.d == null || w60Var.d == null)) {
                    i8 = 2;
                }
                w60 w60Var3 = e70Var.B;
                w60 w60Var4 = e70Var.z;
                int i10 = (i9 == 3 && e70Var.k == 1 && (w60Var4.d == null || w60Var3.d == null)) ? 2 : i9;
                gd1 gd1Var = e70Var.d;
                gd1Var.d = i8;
                int i11 = e70Var.j;
                gd1Var.a = i11;
                wh5 wh5Var = e70Var.e;
                wh5Var.d = i10;
                int i12 = e70Var.k;
                wh5Var.a = i12;
                zk0 zk0Var3 = gd1Var.e;
                zk0 zk0Var4 = wh5Var.e;
                if (i8 == 4 || i8 == 1) {
                    if (i10 != 4 && i10 != 1) {
                        i2 = 2;
                        if (i10 == 2) {
                            int[] iArr2 = f70Var2.J;
                            w60[] w60VarArr = e70Var.G;
                            if (i8 == 3 || !(i10 == i2 || i10 == 1)) {
                                zk0Var = zk0Var3;
                                zk0Var2 = zk0Var4;
                                i3 = 1;
                                i4 = i10;
                            } else if (i11 == 3) {
                                if (i10 == i2) {
                                    f(e70Var, 2, 0, 2, 0);
                                }
                                int iG3 = e70Var.g();
                                f(e70Var, 1, (int) ((iG3 * e70Var.N) + 0.5f), 1, iG3);
                                zk0Var3.d(e70Var.j());
                                zk0Var4.d(e70Var.g());
                                e70Var.a = true;
                            } else {
                                zk0Var = zk0Var3;
                                zk0Var2 = zk0Var4;
                                if (i11 == 1) {
                                    f(e70Var, 2, 0, i10, 0);
                                    zk0Var.m = e70Var.j();
                                } else {
                                    i4 = i10;
                                    if (i11 == 2) {
                                        int i13 = iArr2[0];
                                        if (i13 == 1 || i13 == 4) {
                                            f(e70Var, 1, (int) ((f * f70Var.j()) + 0.5f), i4, e70Var.g());
                                            zk0Var.d(e70Var.j());
                                            zk0Var2.d(e70Var.g());
                                            e70Var.a = true;
                                        }
                                    } else if (w60VarArr[0].d == null || w60VarArr[1].d == null) {
                                        f(e70Var, 2, 0, i4, 0);
                                        zk0Var.d(e70Var.j());
                                        zk0Var2.d(e70Var.g());
                                        e70Var.a = true;
                                    }
                                    i3 = 1;
                                }
                            }
                            i5 = 3;
                            if (i4 == 3 || !(i8 == 2 || i8 == i3)) {
                                if (i8 == i5 && i4 == i5) {
                                    if (i11 != i3 || i12 == i3) {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    } else if (i12 == 2 && i11 == 2 && (((i6 = iArr2[0]) == i3 || i6 == i3) && ((i7 = iArr2[i3]) == i3 || i7 == i3))) {
                                        f(e70Var, 1, (int) ((f * f70Var.j()) + 0.5f), 1, (int) ((f2 * f70Var.g()) + 0.5f));
                                        zk0Var.d(e70Var.j());
                                        zk0Var2.d(e70Var.g());
                                        e70Var.a = true;
                                    }
                                }
                            } else if (i12 == 3) {
                                if (i8 == 2) {
                                    f(e70Var, 2, 0, 2, 0);
                                }
                                int iJ3 = e70Var.j();
                                float f3 = e70Var.N;
                                if (e70Var.O == -1) {
                                    f3 = 1.0f / f3;
                                }
                                f(e70Var, 1, iJ3, 1, (int) ((iJ3 * f3) + 0.5f));
                                zk0Var.d(e70Var.j());
                                zk0Var2.d(e70Var.g());
                                e70Var.a = true;
                            } else if (i12 == 1) {
                                f(e70Var, i8, 0, 2, 0);
                                zk0Var2.m = e70Var.g();
                            } else if (i12 == 2) {
                                int i14 = iArr2[1];
                                if (i14 == 1 || i14 == 4) {
                                    f(e70Var, i8, e70Var.j(), 1, (int) ((f2 * f70Var.g()) + 0.5f));
                                    zk0Var.d(e70Var.j());
                                    zk0Var2.d(e70Var.g());
                                    e70Var.a = true;
                                } else {
                                    i3 = 1;
                                    i5 = 3;
                                    if (i8 == i5) {
                                        if (i11 != i3) {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        } else {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        }
                                    }
                                }
                            } else if (w60VarArr[2].d == null || w60VarArr[3].d == null) {
                                f(e70Var, 2, 0, i4, 0);
                                zk0Var.d(e70Var.j());
                                zk0Var2.d(e70Var.g());
                                e70Var.a = true;
                            } else {
                                i3 = 1;
                                i5 = 3;
                                if (i8 == i5) {
                                    if (i11 != i3) {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    } else {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    }
                                }
                            }
                        }
                    }
                    i = i10;
                    iJ = e70Var.j();
                    if (i8 == 4) {
                        iJ2 = (f70Var.j() - w60Var2.e) - w60Var.e;
                        i8 = 1;
                    } else {
                        iJ2 = iJ;
                    }
                    iG = e70Var.g();
                    if (i == 4) {
                        iG2 = (f70Var.g() - w60Var4.e) - w60Var3.e;
                        i = 1;
                    } else {
                        iG2 = iG;
                    }
                    f(e70Var, i8, iJ2, i, iG2);
                    zk0Var3.d(e70Var.j());
                    zk0Var4.d(e70Var.g());
                    e70Var.a = true;
                } else {
                    i2 = 2;
                    if (i8 == 2) {
                        if (i10 != 4) {
                            i2 = 2;
                            if (i10 == 2) {
                                int[] iArr3 = f70Var2.J;
                                w60[] w60VarArr2 = e70Var.G;
                                if (i8 == 3) {
                                    zk0Var = zk0Var3;
                                    zk0Var2 = zk0Var4;
                                    i3 = 1;
                                    i4 = i10;
                                    i5 = 3;
                                    if (i4 == 3) {
                                        if (i8 == i5) {
                                            if (i11 != i3) {
                                                f(e70Var, 2, 0, 2, 0);
                                                zk0Var.m = e70Var.j();
                                                zk0Var2.m = e70Var.g();
                                            } else {
                                                f(e70Var, 2, 0, 2, 0);
                                                zk0Var.m = e70Var.j();
                                                zk0Var2.m = e70Var.g();
                                            }
                                        }
                                    } else if (i8 == i5) {
                                        if (i11 != i3) {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        } else {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        }
                                    }
                                } else {
                                    zk0Var = zk0Var3;
                                    zk0Var2 = zk0Var4;
                                    i3 = 1;
                                    i4 = i10;
                                    i5 = 3;
                                    if (i4 == 3) {
                                        if (i8 == i5) {
                                            if (i11 != i3) {
                                                f(e70Var, 2, 0, 2, 0);
                                                zk0Var.m = e70Var.j();
                                                zk0Var2.m = e70Var.g();
                                            } else {
                                                f(e70Var, 2, 0, 2, 0);
                                                zk0Var.m = e70Var.j();
                                                zk0Var2.m = e70Var.g();
                                            }
                                        }
                                    } else if (i8 == i5) {
                                        if (i11 != i3) {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        } else {
                                            f(e70Var, 2, 0, 2, 0);
                                            zk0Var.m = e70Var.j();
                                            zk0Var2.m = e70Var.g();
                                        }
                                    }
                                }
                            }
                        }
                        i = i10;
                        iJ = e70Var.j();
                        if (i8 == 4) {
                            iJ2 = (f70Var.j() - w60Var2.e) - w60Var.e;
                            i8 = 1;
                        } else {
                            iJ2 = iJ;
                        }
                        iG = e70Var.g();
                        if (i == 4) {
                            iG2 = (f70Var.g() - w60Var4.e) - w60Var3.e;
                            i = 1;
                        } else {
                            iG2 = iG;
                        }
                        f(e70Var, i8, iJ2, i, iG2);
                        zk0Var3.d(e70Var.j());
                        zk0Var4.d(e70Var.g());
                        e70Var.a = true;
                    } else {
                        int[] iArr4 = f70Var2.J;
                        w60[] w60VarArr3 = e70Var.G;
                        if (i8 == 3) {
                            zk0Var = zk0Var3;
                            zk0Var2 = zk0Var4;
                            i3 = 1;
                            i4 = i10;
                            i5 = 3;
                            if (i4 == 3) {
                                if (i8 == i5) {
                                    if (i11 != i3) {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    } else {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    }
                                }
                            } else if (i8 == i5) {
                                if (i11 != i3) {
                                    f(e70Var, 2, 0, 2, 0);
                                    zk0Var.m = e70Var.j();
                                    zk0Var2.m = e70Var.g();
                                } else {
                                    f(e70Var, 2, 0, 2, 0);
                                    zk0Var.m = e70Var.j();
                                    zk0Var2.m = e70Var.g();
                                }
                            }
                        } else {
                            zk0Var = zk0Var3;
                            zk0Var2 = zk0Var4;
                            i3 = 1;
                            i4 = i10;
                            i5 = 3;
                            if (i4 == 3) {
                                if (i8 == i5) {
                                    if (i11 != i3) {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    } else {
                                        f(e70Var, 2, 0, 2, 0);
                                        zk0Var.m = e70Var.j();
                                        zk0Var2.m = e70Var.g();
                                    }
                                }
                            } else if (i8 == i5) {
                                if (i11 != i3) {
                                    f(e70Var, 2, 0, 2, 0);
                                    zk0Var.m = e70Var.j();
                                    zk0Var2.m = e70Var.g();
                                } else {
                                    f(e70Var, 2, 0, 2, 0);
                                    zk0Var.m = e70Var.j();
                                    zk0Var2.m = e70Var.g();
                                }
                            }
                        }
                    }
                }
                f70Var2 = f70Var;
            }
        }
    }

    public final void c() {
        ArrayList<cm5> arrayList = this.e;
        arrayList.clear();
        f70 f70Var = this.d;
        f70Var.d.f();
        wh5 wh5Var = f70Var.e;
        wh5Var.f();
        arrayList.add(f70Var.d);
        arrayList.add(wh5Var);
        HashSet hashSet = null;
        for (e70 e70Var : f70Var.e0) {
            if (e70Var instanceof bb1) {
                arrayList.add(new cb1(e70Var));
            } else {
                if (e70Var.o()) {
                    if (e70Var.b == null) {
                        e70Var.b = new zn(e70Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(e70Var.b);
                } else {
                    arrayList.add(e70Var.d);
                }
                if (e70Var.p()) {
                    if (e70Var.c == null) {
                        e70Var.c = new zn(e70Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(e70Var.c);
                } else {
                    arrayList.add(e70Var.e);
                }
                if (e70Var instanceof yc1) {
                    arrayList.add(new xc1(e70Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<cm5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (cm5 cm5Var : arrayList) {
            if (cm5Var.b != f70Var) {
                cm5Var.d();
            }
        }
        ArrayList<zu3> arrayList2 = this.h;
        arrayList2.clear();
        f70 f70Var2 = this.a;
        e(f70Var2.d, 0, arrayList2);
        e(f70Var2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(f70 f70Var, int i) {
        int i2;
        long j;
        long j2;
        ArrayList<zu3> arrayList;
        long j3;
        float f;
        long j4;
        ArrayList<zu3> arrayList2 = this.h;
        int size = arrayList2.size();
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            cm5 cm5Var = arrayList2.get(i3).a;
            if (!(cm5Var instanceof zn) ? !(i != 0 ? (cm5Var instanceof wh5) : (cm5Var instanceof gd1)) : ((zn) cm5Var).f != i) {
                qj0 qj0Var = (i == 0 ? f70Var.d : f70Var.e).h;
                qj0 qj0Var2 = (i == 0 ? f70Var.d : f70Var.e).i;
                boolean zContains = cm5Var.h.l.contains(qj0Var);
                qj0 qj0Var3 = cm5Var.i;
                boolean zContains2 = qj0Var3.l.contains(qj0Var2);
                long j5 = cm5Var.j();
                qj0 qj0Var4 = cm5Var.h;
                if (zContains && zContains2) {
                    long jB = zu3.b(qj0Var4, 0L);
                    ArrayList<zu3> arrayList3 = arrayList2;
                    i2 = size;
                    long jA = zu3.a(qj0Var3, 0L);
                    long j6 = jB - j5;
                    int i4 = qj0Var3.f;
                    j3 = jMax;
                    arrayList = arrayList3;
                    if (j6 >= (-i4)) {
                        j6 += (long) i4;
                    }
                    long j7 = (-jA) - j5;
                    long j8 = qj0Var4.f;
                    long j9 = j7 - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    e70 e70Var = cm5Var.b;
                    if (i == 0) {
                        f = e70Var.U;
                    } else if (i == 1) {
                        f = e70Var.V;
                    } else {
                        e70Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j4 = (long) ((j6 / (1.0f - f)) + (j9 / f));
                    } else {
                        j4 = 0;
                    }
                    float f2 = j4;
                    j2 = (((long) qj0Var4.f) + ((((long) ((f2 * f) + 0.5f)) + j5) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) qj0Var3.f);
                } else {
                    i2 = size;
                    j3 = jMax;
                    arrayList = arrayList2;
                    if (zContains) {
                        j2 = Math.max(zu3.b(qj0Var4, qj0Var4.f), ((long) qj0Var4.f) + j5);
                    } else if (zContains2) {
                        j2 = Math.max(-zu3.a(qj0Var3, qj0Var3.f), ((long) (-qj0Var3.f)) + j5);
                    } else {
                        j2 = (cm5Var.j() + ((long) qj0Var4.f)) - ((long) qj0Var3.f);
                    }
                }
                j = j3;
            } else {
                i2 = size;
                j = jMax;
                j2 = 0;
                arrayList = arrayList2;
            }
            i3++;
            arrayList2 = arrayList;
            size = i2;
            jMax = Math.max(j, j2);
        }
        return (int) jMax;
    }

    public final void e(cm5 cm5Var, int i, ArrayList<zu3> arrayList) {
        qj0 qj0Var;
        Iterator it = cm5Var.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qj0Var = cm5Var.i;
            if (!zHasNext) {
                break;
            }
            lj0 lj0Var = (lj0) it.next();
            if (lj0Var instanceof qj0) {
                a((qj0) lj0Var, i, 0, arrayList, null);
            } else if (lj0Var instanceof cm5) {
                a(((cm5) lj0Var).h, i, 0, arrayList, null);
            }
        }
        for (lj0 lj0Var2 : qj0Var.k) {
            if (lj0Var2 instanceof qj0) {
                a((qj0) lj0Var2, i, 1, arrayList, null);
            } else if (lj0Var2 instanceof cm5) {
                a(((cm5) lj0Var2).i, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            for (lj0 lj0Var3 : ((wh5) cm5Var).k.k) {
                if (lj0Var3 instanceof qj0) {
                    a((qj0) lj0Var3, i, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(e70 e70Var, int i, int i2, int i3, int i4) {
        f9.QnHx qnHx = this.g;
        qnHx.a = i;
        qnHx.b = i3;
        qnHx.c = i2;
        qnHx.d = i4;
        ((ConstraintLayout.CQf) this.f).a(e70Var, qnHx);
        e70Var.v(qnHx.e);
        e70Var.s(qnHx.f);
        e70Var.w = qnHx.h;
        int i5 = qnHx.g;
        e70Var.R = i5;
        e70Var.w = i5 > 0;
    }

    public final void g() {
        v8 v8Var;
        for (e70 e70Var : this.a.e0) {
            if (!e70Var.a) {
                int[] iArr = e70Var.J;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = e70Var.j;
                int i4 = e70Var.k;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                gd1 gd1Var = e70Var.d;
                zk0 zk0Var = gd1Var.e;
                boolean z3 = zk0Var.j;
                wh5 wh5Var = e70Var.e;
                zk0 zk0Var2 = wh5Var.e;
                boolean z4 = zk0Var2.j;
                if (z3 && z4) {
                    f(e70Var, 1, zk0Var.g, 1, zk0Var2.g);
                    e70Var.a = true;
                } else if (z3 && z) {
                    f(e70Var, 1, zk0Var.g, 2, zk0Var2.g);
                    zk0 zk0Var3 = wh5Var.e;
                    if (i2 == 3) {
                        zk0Var3.m = e70Var.g();
                    } else {
                        zk0Var3.d(e70Var.g());
                        e70Var.a = true;
                    }
                } else if (z4 && z2) {
                    f(e70Var, 2, zk0Var.g, 1, zk0Var2.g);
                    zk0 zk0Var4 = gd1Var.e;
                    if (i == 3) {
                        zk0Var4.m = e70Var.j();
                    } else {
                        zk0Var4.d(e70Var.j());
                        e70Var.a = true;
                    }
                }
                if (e70Var.a && (v8Var = wh5Var.l) != null) {
                    v8Var.d(e70Var.R);
                }
            }
        }
    }
}

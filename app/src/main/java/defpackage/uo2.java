package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uo2 extends xo2 {
    public final j93 b;
    public iy1 e;
    public y83 f;
    public boolean g;
    public final ui2<c93> c = new ui2<>(new c93[16]);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;
    public boolean i = true;

    public uo2(j93 j93Var) {
        this.b = j93Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d8 A[EDGE_INSN: B:101:0x01d8->B:102:0x01d9 BREAK  A[LOOP:4: B:95:0x01ba->B:99:0x01d3]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[ADDED_TO_REGION] */
    @Override // defpackage.xo2
    public final boolean a(Map<c93, d93> map, iy1 iy1Var, zp1 zp1Var, boolean z) {
        LinkedHashMap linkedHashMap;
        ui2<c93> ui2Var;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        int i2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean zA = super.a(map, iy1Var, zp1Var, z);
        j93 j93Var = this.b;
        if (!j93Var.x) {
            return true;
        }
        this.e = j93Var.w;
        Iterator<Map.Entry<c93, d93>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.d;
            int i3 = 0;
            ui2Var = this.c;
            if (!zHasNext) {
                break;
            }
            Map.Entry<c93, d93> next = it.next();
            long j = next.getKey().a;
            d93 value = next.getValue();
            if (ui2Var.f(new c93(j))) {
                ArrayList arrayList = new ArrayList();
                List list = value.j;
                if (list == null) {
                    list = cs0.w;
                }
                int size = list.size();
                while (i3 < size) {
                    bd1 bd1Var = (bd1) list.get(i3);
                    arrayList.add(new bd1(bd1Var.a, this.e.L(iy1Var, bd1Var.b)));
                    i3++;
                    list = list;
                    size = size;
                    linkedHashMap = linkedHashMap;
                    it = it;
                }
                Iterator<Map.Entry<c93, d93>> it2 = it;
                c93 c93Var = new c93(j);
                d93 d93Var = new d93(value.a, value.b, this.e.L(iy1Var, value.c), value.d, value.e, this.e.L(iy1Var, value.f), value.g, value.h, arrayList, value.i);
                d93Var.k = value.k;
                linkedHashMap.put(c93Var, d93Var);
                it = it2;
            }
        }
        if (linkedHashMap.isEmpty()) {
            ui2Var.e();
            this.a.e();
            return true;
        }
        for (int i4 = ui2Var.y - 1; -1 < i4; i4--) {
            if (!map.containsKey(new c93(ui2Var.w[i4].a))) {
                ui2Var.n(i4);
            }
        }
        List listE1 = wu.e1(linkedHashMap.values());
        y83 y83Var = new y83(listE1, zp1Var);
        int size2 = listE1.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj = null;
                break;
            }
            obj = listE1.get(i5);
            if (zp1Var.a(((d93) obj).a)) {
                break;
            }
            i5++;
        }
        d93 d93Var2 = (d93) obj;
        if (d93Var2 != null) {
            boolean z11 = d93Var2.d;
            if (z) {
                if (!this.h && (z11 || d93Var2.g)) {
                    z2 = true;
                    this.h = !Cz.v(d93Var2, this.e.a());
                }
                z4 = this.h;
                z5 = this.g;
                if (z4 == z5) {
                    i = y83Var.c;
                    if (i == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6 || !z5 || this.i) {
                        if (i == 5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7 && z4 && z11) {
                            y83Var.c = 3;
                        }
                    } else {
                        y83Var.c = 3;
                    }
                } else {
                    i2 = y83Var.c;
                    if (i2 == 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        if (i2 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9) {
                            if (i2 == 5) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i = y83Var.c;
                                if (i == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    if (i == 5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        y83Var.c = 3;
                                    }
                                } else {
                                    if (i == 5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        y83Var.c = 3;
                                    }
                                }
                            }
                        }
                    }
                    y83Var.c = z4 ? 4 : 5;
                }
            } else {
                this.h = false;
            }
            z2 = true;
            z4 = this.h;
            z5 = this.g;
            if (z4 == z5) {
                i = y83Var.c;
                if (i == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (i == 5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        y83Var.c = 3;
                    }
                } else {
                    if (i == 5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        y83Var.c = 3;
                    }
                }
            } else {
                i2 = y83Var.c;
                if (i2 == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    if (i2 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        if (i2 == 5) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i = y83Var.c;
                            if (i == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (i == 5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    y83Var.c = 3;
                                }
                            } else {
                                if (i == 5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    y83Var.c = 3;
                                }
                            }
                        }
                    }
                }
                y83Var.c = z4 ? 4 : 5;
            }
        } else {
            z2 = true;
        }
        if (!zA) {
            if (y83Var.c == 3) {
                y83 y83Var2 = this.f;
                if (y83Var2 == null) {
                    z3 = true;
                    break;
                }
                List<d93> list2 = y83Var2.a;
                int size3 = list2.size();
                List<d93> list3 = y83Var.a;
                if (size3 != list3.size()) {
                    z3 = true;
                    break;
                }
                int size4 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        z3 = false;
                        break;
                    }
                    if (!kt2.a(list2.get(i6).c, list3.get(i6).c)) {
                        z3 = true;
                        break;
                    }
                    i6++;
                }
                if (!z3) {
                    z2 = false;
                }
            }
        }
        this.f = y83Var;
        return z2;
    }

    @Override // defpackage.xo2
    public final void b(zp1 zp1Var) {
        super.b(zp1Var);
        y83 y83Var = this.f;
        if (y83Var == null) {
            return;
        }
        this.g = this.h;
        List<d93> list = y83Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            d93 d93Var = list.get(i);
            boolean z2 = d93Var.d;
            long j = d93Var.a;
            if (z2 || (zp1Var.a(j) && this.h)) {
                z = false;
            }
            if (z) {
                this.c.l(new c93(j));
            }
            i++;
        }
        this.h = false;
        this.i = y83Var.c == 5;
    }

    @Override // defpackage.xo2
    public final void c() {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        if (i > 0) {
            uo2[] uo2VarArr = ui2Var.w;
            int i2 = 0;
            do {
                uo2VarArr[i2].c();
                i2++;
            } while (i2 < i);
        }
        this.b.A();
    }

    @Override // defpackage.xo2
    public final boolean d(zp1 zp1Var) {
        ui2<uo2> ui2Var;
        int i;
        LinkedHashMap linkedHashMap = this.d;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!linkedHashMap.isEmpty()) {
            j93 j93Var = this.b;
            if (j93Var.x) {
                j93Var.I(this.f, z83.Final, this.e.a());
                if (j93Var.x && (i = (ui2Var = this.a).y) > 0) {
                    uo2[] uo2VarArr = ui2Var.w;
                    do {
                        uo2VarArr[i2].d(zp1Var);
                        i2++;
                    } while (i2 < i);
                }
                z = true;
            }
        }
        b(zp1Var);
        linkedHashMap.clear();
        this.e = null;
        return z;
    }

    @Override // defpackage.xo2
    public final boolean e(Map<c93, d93> map, iy1 iy1Var, zp1 zp1Var, boolean z) {
        ui2<uo2> ui2Var;
        int i;
        LinkedHashMap linkedHashMap = this.d;
        int i2 = 0;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        j93 j93Var = this.b;
        if (!j93Var.x) {
            return false;
        }
        y83 y83Var = this.f;
        long jA = this.e.a();
        j93Var.I(y83Var, z83.Initial, jA);
        if (j93Var.x && (i = (ui2Var = this.a).y) > 0) {
            uo2[] uo2VarArr = ui2Var.w;
            do {
                uo2VarArr[i2].e(linkedHashMap, this.e, zp1Var, z);
                i2++;
            } while (i2 < i);
        }
        if (j93Var.x) {
            j93Var.I(y83Var, z83.Main, jA);
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.a + ", pointerIds=" + this.c + ')';
    }
}

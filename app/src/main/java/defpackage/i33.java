package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i33<TSubject, TContext> {
    private volatile /* synthetic */ Object _interceptors;
    public final ArrayList a;
    public int b;
    public boolean c;
    public ta2 d;

    public i33(ta2... ta2VarArr) {
        new c50();
        this.a = ps0.P(Arrays.copyOf(ta2VarArr, ta2VarArr.length));
        this._interceptors = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[LOOP:2: B:33:0x007d->B:34:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:1: B:26:0x005b->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x008e A[EDGE_INSN: B:46:0x008e->B:37:0x008e BREAK  A[LOOP:1: B:26:0x005b->B:36:0x008b], SYNTHETIC] */
    public final Object a(TContext tcontext, TSubject tsubject, z80<? super TSubject> z80Var) {
        ArrayList arrayList;
        int iJ;
        int i;
        Object obj;
        e23 e23Var;
        List<y81<k33<TSubject, Call>, TSubject, z80<? super sd5>, Object>> list;
        int size;
        int i2;
        int iJ2;
        la0 context = z80Var.getContext();
        if (((List) this._interceptors) == null) {
            int i3 = this.b;
            if (i3 == 0) {
                this._interceptors = cs0.w;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList2 = this.a;
                if (i3 != 1 || (iJ2 = ps0.J(arrayList2)) < 0) {
                    arrayList = new ArrayList();
                    iJ = ps0.J(arrayList2);
                    if (iJ >= 0) {
                        i = 0;
                        while (true) {
                            obj = arrayList2.get(i);
                            if (obj instanceof e23) {
                                e23Var = (e23) obj;
                            } else {
                                e23Var = null;
                            }
                            if (e23Var != null) {
                                list = e23Var.c;
                                arrayList.ensureCapacity(list.size() + arrayList.size());
                                size = list.size();
                                for (i2 = 0; i2 < size; i2++) {
                                    arrayList.add(list.get(i2));
                                }
                            }
                            if (i != iJ) {
                                break;
                            }
                            i++;
                        }
                    }
                    this._interceptors = arrayList;
                    this.c = false;
                    this.d = null;
                } else {
                    int i4 = 0;
                    while (true) {
                        Object obj2 = arrayList2.get(i4);
                        e23 e23Var2 = obj2 instanceof e23 ? (e23) obj2 : null;
                        if (e23Var2 != null && !e23Var2.c.isEmpty()) {
                            Collection collection = e23Var2.c;
                            e23Var2.d = true;
                            this._interceptors = collection;
                            this.c = false;
                            this.d = e23Var2.a;
                        } else if (i4 != iJ2) {
                            i4++;
                        } else {
                            arrayList = new ArrayList();
                            iJ = ps0.J(arrayList2);
                            if (iJ >= 0) {
                                i = 0;
                                while (true) {
                                    obj = arrayList2.get(i);
                                    if (obj instanceof e23) {
                                        e23Var = (e23) obj;
                                    } else {
                                        e23Var = null;
                                    }
                                    if (e23Var != null) {
                                        list = e23Var.c;
                                        arrayList.ensureCapacity(list.size() + arrayList.size());
                                        size = list.size();
                                        while (i2 < size) {
                                            arrayList.add(list.get(i2));
                                        }
                                    }
                                    if (i != iJ) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            this._interceptors = arrayList;
                            this.c = false;
                            this.d = null;
                        }
                    }
                }
            }
        }
        this.c = true;
        List list2 = (List) this._interceptors;
        return (d() ? new jf0(tcontext, list2, tsubject, context) : new ox4(tsubject, tcontext, list2)).a(tsubject, z80Var);
    }

    public final e23<TSubject, TContext> b(ta2 ta2Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == ta2Var) {
                e23<TSubject, TContext> e23Var = new e23<>(ta2Var, a43.F1.a);
                arrayList.set(i, e23Var);
                return e23Var;
            }
            if (obj instanceof e23) {
                e23<TSubject, TContext> e23Var2 = (e23) obj;
                if (e23Var2.a == ta2Var) {
                    return e23Var2;
                }
            }
        }
        return null;
    }

    public final int c(ta2 ta2Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == ta2Var || ((obj instanceof e23) && ((e23) obj).a == ta2Var)) {
                return i;
            }
        }
        return -1;
    }

    public boolean d() {
        return false;
    }

    public final boolean e(ta2 ta2Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == ta2Var) {
                return true;
            }
            if ((obj instanceof e23) && ((e23) obj).a == ta2Var) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public final void f(ta2 ta2Var, y81<? super k33<TSubject, TContext>, ? super TSubject, ? super z80<? super sd5>, ? extends Object> y81Var) {
        boolean z;
        e23<TSubject, TContext> e23VarB = b(ta2Var);
        if (e23VarB == null) {
            throw new as1("Phase " + ta2Var + " was not registered for this pipeline");
        }
        sb5.d(3, y81Var);
        List list = (List) this._interceptors;
        if (this.a.isEmpty() || list == null || this.c) {
            z = false;
        } else {
            if ((list instanceof List) && (!(list instanceof jv1) || (list instanceof lv1))) {
                if (ur1.a(this.d, ta2Var)) {
                    list.add(y81Var);
                } else if (ur1.a(ta2Var, wu.N0(this.a)) || c(ta2Var) == ps0.J(this.a)) {
                    e23<TSubject, TContext> e23VarB2 = b(ta2Var);
                    if (e23VarB2.d) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(e23VarB2.c);
                        e23VarB2.c = arrayList;
                        e23VarB2.d = false;
                    }
                    e23VarB2.c.add(y81Var);
                    list.add(y81Var);
                } else {
                    z = false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.b++;
            return;
        }
        if (e23VarB.d) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(e23VarB.c);
            e23VarB.c = arrayList2;
            e23VarB.d = false;
        }
        e23VarB.c.add(y81Var);
        this.b++;
        this._interceptors = null;
        this.c = false;
        this.d = null;
    }
}

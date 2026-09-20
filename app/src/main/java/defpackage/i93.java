package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i93 {
    public final yy1 a;
    public final ss3 b;
    public final e93 c = new e93();
    public final cd1<j93> d = new cd1<>();
    public boolean e;

    public i93(yy1 yy1Var) {
        this.a = yy1Var;
        this.b = new ss3(yy1Var.Y);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x011e, TRY_ENTER, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #0 {all -> 0x011e, blocks: (B:6:0x000d, B:8:0x001b, B:10:0x0025, B:29:0x0055, B:30:0x005f, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:42:0x007c, B:46:0x0085, B:48:0x0099, B:49:0x00a2, B:58:0x00d2, B:61:0x00d7, B:63:0x00e1, B:66:0x00eb, B:67:0x00ef, B:69:0x00f5, B:71:0x0108, B:52:0x00b9, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0117  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x00a2 A[EDGE_INSN: B:88:0x00a2->B:49:0x00a2 BREAK  A[LOOP:0: B:30:0x005f->B:92:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0114 A[SYNTHETIC] */
    public final int a(g93 g93Var, ja3 ja3Var, boolean z) {
        boolean z2;
        boolean z3;
        Iterator<T> it;
        boolean zHasNext;
        ss3 ss3Var;
        Object obj;
        Collection<d93> collectionValues;
        Iterator<T> it2;
        d93 d93Var;
        boolean z4;
        int i;
        d93 d93Var2;
        boolean z5;
        boolean z6;
        cd1<j93> cd1Var = this.d;
        if (this.e) {
            return 0;
        }
        boolean z7 = true;
        try {
            this.e = true;
            zp1 zp1VarA = this.c.a(g93Var, ja3Var);
            Map<c93, d93> map = zp1VarA.a;
            Collection<d93> collectionValues2 = map.values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator<T> it3 = collectionValues2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        d93 d93Var3 = (d93) it3.next();
                        if (d93Var3.d || d93Var3.g) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                it = map.values().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    ss3Var = this.b;
                    if (zHasNext) {
                        break;
                    }
                    d93Var2 = (d93) it.next();
                    if (z3) {
                        if (d93Var2.g && d93Var2.d) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                        }
                    }
                    if (d93Var2.h == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    yy1 yy1Var = this.a;
                    long j = d93Var2.c;
                    cd1<j93> cd1Var2 = this.d;
                    yy1.F1 f1 = yy1.p0;
                    yy1Var.w(j, cd1Var2, z5, true);
                    if (!cd1Var.isEmpty()) {
                        ss3Var.d(d93Var2.a, cd1Var);
                        cd1Var.clear();
                    }
                }
                ((xo2) ss3Var.y).f();
                obj = ss3Var.y;
                if (!((xo2) obj).a(map, (iy1) ss3Var.x, zp1VarA, z)) {
                    int i2 = (!((xo2) obj).d(zp1VarA) || ((xo2) obj).e(map, (iy1) ss3Var.x, zp1VarA, z)) ? 1 : 0;
                    if (zp1VarA.c) {
                        collectionValues = map.values();
                        if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            it2 = collectionValues.iterator();
                            do {
                                if (it2.hasNext()) {
                                    d93Var = (d93) it2.next();
                                    if ((!kt2.a(Cz.A(d93Var, true), kt2.b)) || !d93Var.b()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                }
                            } while (!z4);
                            if (z7) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            int i3 = i2 | i;
                            this.e = false;
                            return i3;
                        }
                    }
                    z7 = false;
                    if (z7) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i4 = i2 | i;
                    this.e = false;
                    return i4;
                }
                if (zp1VarA.c) {
                    collectionValues = map.values();
                    if (collectionValues instanceof Collection) {
                        it2 = collectionValues.iterator();
                        do {
                            if (it2.hasNext()) {
                                d93Var = (d93) it2.next();
                                if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                        } while (!z4);
                    } else {
                        it2 = collectionValues.iterator();
                        do {
                            if (it2.hasNext()) {
                                d93Var = (d93) it2.next();
                                if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                        } while (!z4);
                    }
                    if (z7) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i5 = i2 | i;
                    this.e = false;
                    return i5;
                }
                z7 = false;
                if (z7) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i6 = i2 | i;
                this.e = false;
                return i6;
            }
            z2 = false;
            if (z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            it = map.values().iterator();
            while (true) {
                zHasNext = it.hasNext();
                ss3Var = this.b;
                if (zHasNext) {
                    break;
                    break;
                }
                d93Var2 = (d93) it.next();
                if (z3) {
                    if (d93Var2.g) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                    }
                }
                if (d93Var2.h == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                yy1 yy1Var2 = this.a;
                long j2 = d93Var2.c;
                cd1<j93> cd1Var3 = this.d;
                yy1.F1 f2 = yy1.p0;
                yy1Var2.w(j2, cd1Var3, z5, true);
                if (!cd1Var.isEmpty()) {
                    ss3Var.d(d93Var2.a, cd1Var);
                    cd1Var.clear();
                }
            }
            ((xo2) ss3Var.y).f();
            obj = ss3Var.y;
            if (!((xo2) obj).a(map, (iy1) ss3Var.x, zp1VarA, z)) {
                if (((xo2) obj).d(zp1VarA)) {
                }
                if (zp1VarA.c) {
                    collectionValues = map.values();
                    if (collectionValues instanceof Collection) {
                        it2 = collectionValues.iterator();
                        do {
                            if (it2.hasNext()) {
                                d93Var = (d93) it2.next();
                                if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                        } while (!z4);
                    } else {
                        it2 = collectionValues.iterator();
                        do {
                            if (it2.hasNext()) {
                                d93Var = (d93) it2.next();
                                if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                        } while (!z4);
                    }
                    if (z7) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i7 = i2 | i;
                    this.e = false;
                    return i7;
                }
                z7 = false;
                if (z7) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i8 = i2 | i;
                this.e = false;
                return i8;
            }
            if (zp1VarA.c) {
                collectionValues = map.values();
                if (collectionValues instanceof Collection) {
                    it2 = collectionValues.iterator();
                    do {
                        if (it2.hasNext()) {
                            d93Var = (d93) it2.next();
                            if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        }
                    } while (!z4);
                } else {
                    it2 = collectionValues.iterator();
                    do {
                        if (it2.hasNext()) {
                            d93Var = (d93) it2.next();
                            if (!kt2.a(Cz.A(d93Var, true), kt2.b)) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        }
                    } while (!z4);
                }
                if (z7) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i9 = i2 | i;
                this.e = false;
                return i9;
            }
            z7 = false;
            if (z7) {
                i = 2;
            } else {
                i = 0;
            }
            int i10 = i2 | i;
            this.e = false;
            return i10;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}

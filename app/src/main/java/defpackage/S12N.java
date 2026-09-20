package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: loaded from: classes.dex */
public final class S12N implements x54, b91, qf6 {
    public static ej1 x;
    public static ej1 y;
    public static final S12N w = new S12N();
    public static final xj0.QnHx z = new xj0.QnHx();
    public static final rv1[] A = new rv1[0];
    public static final /* synthetic */ S12N B = new S12N();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void c(z80 z80Var) throws Throwable {
        ui0 ui0Var;
        if (z80Var instanceof ui0) {
            ui0Var = (ui0) z80Var;
            int i = ui0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                ui0Var.A = i - Integer.MIN_VALUE;
            } else {
                ui0Var = new ui0(z80Var);
            }
        } else {
            ui0Var = new ui0(z80Var);
        }
        Object obj = ui0Var.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = ui0Var.A;
        if (i2 == 0) {
            C0239D.H(obj);
            ui0Var.A = 1;
            xm xmVar = new xm(1, ps0.L(ui0Var));
            xmVar.r();
            if (xmVar.p() == va0Var) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final Map d(pa4 pa4Var) {
        String[] strArrNames;
        int iF = pa4Var.f();
        ConcurrentHashMap concurrentHashMap = null;
        for (int i = 0; i < iF; i++) {
            List<Annotation> listI = pa4Var.i(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (obj instanceof mu1) {
                    arrayList.add(obj);
                }
            }
            mu1 mu1Var = (mu1) wu.X0(arrayList);
            if (mu1Var != null && (strArrNames = mu1Var.names()) != null) {
                for (String str : strArrNames) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap(pa4Var.f());
                    }
                    if (concurrentHashMap.containsKey(str)) {
                        StringBuilder sbA = N.a("The suggested name '", str, "' for property ");
                        sbA.append(pa4Var.g(i));
                        sbA.append(" is already one of the names for property ");
                        sbA.append(pa4Var.g(((Number) t92.P(str, concurrentHashMap)).intValue()));
                        sbA.append(" in ");
                        sbA.append(pa4Var);
                        throw new JsonException(sbA.toString());
                    }
                    concurrentHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return concurrentHashMap == null ? ds0.w : concurrentHashMap;
    }

    public static final Object e(long j, z80 z80Var) {
        if (j <= 0) {
            return sd5.a;
        }
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        if (j < Long.MAX_VALUE) {
            g(xmVar.A).f(j, xmVar);
        }
        Object objP = xmVar.p();
        return objP == va0.COROUTINE_SUSPENDED ? objP : sd5.a;
    }

    public static final Object f(long j, z80 z80Var) {
        long jG = 0;
        if (gq0.d(j, 0L) > 0) {
            jG = gq0.g(j);
            if (jG < 1) {
                jG = 1;
            }
        }
        Object objE = e(jG, z80Var);
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }

    public static final ti0 g(la0 la0Var) {
        int i = c90.f;
        la0.CQf cQfJ = la0Var.j(c90.QnHx.w);
        ti0 ti0Var = cQfJ instanceof ti0 ? (ti0) cQfJ : null;
        return ti0Var == null ? qg0.a : ti0Var;
    }

    public static final int h(pa4 pa4Var, ws1 ws1Var, String str) {
        int iD = pa4Var.d(str);
        if (iD != -3 || !ws1Var.a.l) {
            return iD;
        }
        xj0.QnHx qnHx = z;
        ConcurrentHashMap concurrentHashMap = ws1Var.c.a;
        Map map = (Map) concurrentHashMap.get(pa4Var);
        Object obj = map != null ? map.get(qnHx) : null;
        Object objD = obj != null ? obj : null;
        if (objD == null) {
            objD = d(pa4Var);
            Object concurrentHashMap2 = concurrentHashMap.get(pa4Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(1);
                concurrentHashMap.put(pa4Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(qnHx, objD);
        }
        Integer num = (Integer) ((Map) objD).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int i(pa4 pa4Var, ws1 ws1Var, String str, String str2) {
        int iH = h(pa4Var, ws1Var, str);
        if (iH != -3) {
            return iH;
        }
        throw new SerializationException(pa4Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final sz j(pg2 pg2Var) {
        return X.n(-1586257396, new ty1(pg2Var), true);
    }

    public static final j24 k(g30 g30Var) {
        g30Var.e(15454635);
        j24 j24Var = (j24) g7.f(new Object[0], j24.d, null, l24.w, g30Var, 4);
        j24Var.c = (m24) g30Var.E(o24.a);
        g30Var.G();
        return j24Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0087, blocks: (B:19:0x004a, B:66:0x0138, B:22:0x0059, B:56:0x0114, B:53:0x0104, B:63:0x0128, B:30:0x0083, B:48:0x00f1, B:67:0x0139, B:68:0x0140), top: B:83:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0139 A[Catch: all -> 0x0087, TryCatch #2 {all -> 0x0087, blocks: (B:19:0x004a, B:66:0x0138, B:22:0x0059, B:56:0x0114, B:53:0x0104, B:63:0x0128, B:30:0x0083, B:48:0x00f1, B:67:0x0139, B:68:0x0140), top: B:83:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [yg1] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [qg1] */
    public static final Object l(ue1 ue1Var, gi giVar, p6 p6Var, z80 z80Var) throws Throwable {
        ei eiVar;
        ?? r12;
        ?? r11;
        yg1 yg1Var;
        x81 x81Var;
        qg1 qg1Var;
        Object objA;
        yg1 yg1Var2;
        x81 x81Var2;
        qg1 qg1Var2;
        ig0 ig0Var;
        ig0 ig0Var2;
        yg1 yg1Var3;
        qg1 qg1Var3;
        yg1 yg1Var4;
        qg1 qg1Var4;
        if (z80Var instanceof ei) {
            eiVar = (ei) z80Var;
            int i = eiVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                eiVar.D = i - Integer.MIN_VALUE;
            } else {
                eiVar = new ei(z80Var);
            }
        } else {
            eiVar = new ei(z80Var);
        }
        Object objB = eiVar.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        try {
            try {
                switch (eiVar.D) {
                    case 0:
                        C0239D.H(objB);
                        lf1.a(ue1Var, wl5.d);
                        ig1 ig1Var = new ig1();
                        zc5 zc5Var = ig1Var.a;
                        hi.w.invoke(zc5Var, zc5Var);
                        giVar.invoke(ig1Var);
                        yg1 yg1Var5 = new yg1(ig1Var, ue1Var);
                        eiVar.z = p6Var;
                        eiVar.A = yg1Var5;
                        eiVar.D = 1;
                        objB = yg1Var5.b(eiVar);
                        if (objB == va0Var) {
                            return va0Var;
                        }
                        yg1Var = yg1Var5;
                        x81Var = p6Var;
                        qg1Var = (qg1) objB;
                        try {
                            ve1 ve1VarC = qg1Var.c();
                            xb5 xb5VarC = nl3.c(ig0.class);
                            rb5 rb5Var = new rb5(pc5.e(xb5VarC), nl3.a(ig0.class), xb5VarC);
                            eiVar.z = x81Var;
                            eiVar.A = yg1Var;
                            eiVar.B = qg1Var;
                            eiVar.D = 2;
                            objA = ve1VarC.a(rb5Var, eiVar);
                            if (objA == va0Var) {
                                return va0Var;
                            }
                            x81 x81Var3 = x81Var;
                            yg1Var2 = yg1Var;
                            x81Var2 = x81Var3;
                            objB = objA;
                            qg1Var2 = qg1Var;
                            if (objB == null) {
                                throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                            }
                            ig0Var = (ig0) objB;
                            try {
                                eiVar.z = yg1Var2;
                                eiVar.A = qg1Var2;
                                eiVar.B = ig0Var;
                                eiVar.D = 3;
                                if (x81Var2.invoke(ig0Var, eiVar) == va0Var) {
                                    return va0Var;
                                }
                                ig0Var2 = ig0Var;
                                qg1Var3 = qg1Var2;
                                yg1Var3 = yg1Var2;
                                eiVar.z = yg1Var3;
                                eiVar.A = qg1Var3;
                                eiVar.B = null;
                                eiVar.D = 4;
                                qg1Var4 = qg1Var3;
                                yg1Var4 = yg1Var3;
                                if (ul5.a(ig0Var2, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                                    return va0Var;
                                }
                                eiVar.z = sd5.a;
                                eiVar.A = null;
                                eiVar.D = 6;
                                if (yg1Var4.a(qg1Var4, eiVar) == va0Var) {
                                    return va0Var;
                                }
                                return sd5.a;
                            } catch (Throwable th) {
                                th = th;
                                eiVar.z = yg1Var2;
                                eiVar.A = qg1Var2;
                                eiVar.B = th;
                                eiVar.D = 5;
                                if (ul5.a(ig0Var, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                                    return va0Var;
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            r11 = yg1Var;
                            th = th2;
                            r12 = qg1Var;
                            eiVar.z = th;
                            eiVar.A = null;
                            eiVar.B = null;
                            eiVar.D = 7;
                            if (r11.a(r12, eiVar) == va0Var) {
                                return va0Var;
                            }
                            throw th;
                        }
                    case 1:
                        yg1Var = (yg1) eiVar.A;
                        x81 x81Var4 = (x81) eiVar.z;
                        C0239D.H(objB);
                        x81Var = x81Var4;
                        qg1Var = (qg1) objB;
                        ve1 ve1VarC2 = qg1Var.c();
                        xb5 xb5VarC2 = nl3.c(ig0.class);
                        rb5 rb5Var2 = new rb5(pc5.e(xb5VarC2), nl3.a(ig0.class), xb5VarC2);
                        eiVar.z = x81Var;
                        eiVar.A = yg1Var;
                        eiVar.B = qg1Var;
                        eiVar.D = 2;
                        objA = ve1VarC2.a(rb5Var2, eiVar);
                        if (objA == va0Var) {
                            return va0Var;
                        }
                        x81 x81Var5 = x81Var;
                        yg1Var2 = yg1Var;
                        x81Var2 = x81Var5;
                        objB = objA;
                        qg1Var2 = qg1Var;
                        if (objB == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                        }
                        ig0Var = (ig0) objB;
                        eiVar.z = yg1Var2;
                        eiVar.A = qg1Var2;
                        eiVar.B = ig0Var;
                        eiVar.D = 3;
                        if (x81Var2.invoke(ig0Var, eiVar) == va0Var) {
                            return va0Var;
                        }
                        ig0Var2 = ig0Var;
                        qg1Var3 = qg1Var2;
                        yg1Var3 = yg1Var2;
                        eiVar.z = yg1Var3;
                        eiVar.A = qg1Var3;
                        eiVar.B = null;
                        eiVar.D = 4;
                        qg1Var4 = qg1Var3;
                        yg1Var4 = yg1Var3;
                        if (ul5.a(ig0Var2, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                            return va0Var;
                        }
                        eiVar.z = sd5.a;
                        eiVar.A = null;
                        eiVar.D = 6;
                        if (yg1Var4.a(qg1Var4, eiVar) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    case 2:
                        qg1 qg1Var5 = (qg1) eiVar.B;
                        yg1 yg1Var6 = (yg1) eiVar.A;
                        x81 x81Var6 = (x81) eiVar.z;
                        C0239D.H(objB);
                        x81Var2 = x81Var6;
                        qg1Var2 = qg1Var5;
                        yg1Var2 = yg1Var6;
                        if (objB == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                        }
                        ig0Var = (ig0) objB;
                        eiVar.z = yg1Var2;
                        eiVar.A = qg1Var2;
                        eiVar.B = ig0Var;
                        eiVar.D = 3;
                        if (x81Var2.invoke(ig0Var, eiVar) == va0Var) {
                            return va0Var;
                        }
                        ig0Var2 = ig0Var;
                        qg1Var3 = qg1Var2;
                        yg1Var3 = yg1Var2;
                        eiVar.z = yg1Var3;
                        eiVar.A = qg1Var3;
                        eiVar.B = null;
                        eiVar.D = 4;
                        qg1Var4 = qg1Var3;
                        yg1Var4 = yg1Var3;
                        if (ul5.a(ig0Var2, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                            return va0Var;
                        }
                        eiVar.z = sd5.a;
                        eiVar.A = null;
                        eiVar.D = 6;
                        if (yg1Var4.a(qg1Var4, eiVar) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    case 3:
                        ig0Var2 = (ig0) eiVar.B;
                        qg1Var2 = (qg1) eiVar.A;
                        yg1Var2 = (yg1) eiVar.z;
                        try {
                            C0239D.H(objB);
                            qg1Var3 = qg1Var2;
                            yg1Var3 = yg1Var2;
                            eiVar.z = yg1Var3;
                            eiVar.A = qg1Var3;
                            eiVar.B = null;
                            eiVar.D = 4;
                            qg1Var4 = qg1Var3;
                            yg1Var4 = yg1Var3;
                            if (ul5.a(ig0Var2, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                                return va0Var;
                            }
                            eiVar.z = sd5.a;
                            eiVar.A = null;
                            eiVar.D = 6;
                            if (yg1Var4.a(qg1Var4, eiVar) == va0Var) {
                                return va0Var;
                            }
                            return sd5.a;
                        } catch (Throwable th3) {
                            ig0Var = ig0Var2;
                            th = th3;
                            eiVar.z = yg1Var2;
                            eiVar.A = qg1Var2;
                            eiVar.B = th;
                            eiVar.D = 5;
                            if (ul5.a(ig0Var, new lt(lt.QnHx.NORMAL, ""), eiVar) == va0Var) {
                                return va0Var;
                            }
                            throw th;
                        }
                    case 4:
                        qg1 qg1Var6 = (qg1) eiVar.A;
                        yg1 yg1Var7 = (yg1) eiVar.z;
                        C0239D.H(objB);
                        qg1Var4 = qg1Var6;
                        yg1Var4 = yg1Var7;
                        eiVar.z = sd5.a;
                        eiVar.A = null;
                        eiVar.D = 6;
                        if (yg1Var4.a(qg1Var4, eiVar) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    case 5:
                        th = (Throwable) eiVar.B;
                        C0239D.H(objB);
                        throw th;
                    case 6:
                        C0239D.H(objB);
                        return sd5.a;
                    case 7:
                        Throwable th4 = (Throwable) eiVar.z;
                        C0239D.H(objB);
                        throw th4;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (CancellationException e) {
                throw X.H(e);
            }
        } catch (Throwable th5) {
            th = th5;
            r12 = giVar;
            r11 = p6Var;
        }
    }

    @Override // defpackage.b91
    public Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return new kf4((df4) obj, ((dd3) obj2).a(), (List) obj3, ((hn2) obj4).b);
    }

    @Override // defpackage.x54
    public long b(a5 a5Var, y83 y83Var) {
        kt2 kt2Var = new kt2(kt2.b);
        List<d93> list = y83Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            long j = kt2Var.a;
            if (i >= size) {
                return kt2.h(j, -a5Var.b0(64));
            }
            kt2 kt2Var2 = new kt2(kt2.g(j, list.get(i).i));
            i++;
            kt2Var = kt2Var2;
        }
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzf());
    }
}

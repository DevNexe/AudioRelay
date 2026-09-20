package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fcT implements bu0<VV4, c8e, tg> {
    public final Context a;
    public final sn4 b;
    public final j81<rPO, sd5> c;

    /* JADX WARN: Multi-variable type inference failed */
    public fcT(Context context, sn4 sn4Var, j81<? super rPO, sd5> j81Var) {
        this.a = context;
        this.b = sn4Var;
        this.c = j81Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) throws Throwable {
        c8e c8eVar = (c8e) obj;
        if (!ur1.a(c8eVar, c8e.CQf.a)) {
            if (ur1.a(c8eVar, c8e.QnHx.a)) {
                this.c.invoke(rPO.QnHx.a);
            } else {
                boolean z = c8eVar instanceof c8e.NUlFixed;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                if (z) {
                    Object objC = c(du0Var, (c8e.NUlFixed) c8eVar, z80Var);
                    return objC == va0Var ? objC : sd5.a;
                }
                if (ur1.a(c8eVar, c8e.F1.a)) {
                    Object objB = b(du0Var, z80Var);
                    return objB == va0Var ? objB : sd5.a;
                }
                if (c8eVar instanceof c8e.LPt8Fixed) {
                    Object objA = this.b.a(this.a.getString(R.string.open_device_settings_error), un4.Short, z80Var);
                    return objA == va0Var ? objA : sd5.a;
                }
            }
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(du0 du0Var, z80 z80Var) throws Throwable {
        qhrr qhrrVar;
        sd5 sd5Var;
        if (z80Var instanceof qhrr) {
            qhrrVar = (qhrr) z80Var;
            int i = qhrrVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qhrrVar.B = i - Integer.MIN_VALUE;
            } else {
                qhrrVar = new qhrr(this, z80Var);
            }
        } else {
            qhrrVar = new qhrr(this, z80Var);
        }
        Object obj = qhrrVar.z;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = qhrrVar.B;
        if (i2 == 0) {
            C0239D.H(obj);
            ComponentActivity componentActivityX = FWT.x(this.a);
            if (componentActivityX != null) {
                xq0 xq0VarE = ac.e(componentActivityX);
                if (xq0VarE instanceof xq0.CQf) {
                    VV4.T23 t23 = VV4.T23.a;
                    qhrrVar.B = 1;
                    if (du0Var.n(t23, qhrrVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (!(xq0VarE instanceof xq0.QnHx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VV4.LPt8Fixed lPt8 = new VV4.LPt8Fixed((Throwable) ((xq0.QnHx) xq0VarE).a);
                    qhrrVar.B = 2;
                    if (du0Var.n(lPt8, qhrrVar) == obj2) {
                        return obj2;
                    }
                }
            } else {
                sd5Var = null;
            }
            if (sd5Var == null) {
                a62.a.l("Can't launch settings, activity not found from context");
            }
            return sd5.a;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0239D.H(obj);
        sd5Var = sd5.a;
        if (sd5Var == null) {
            a62.a.l("Can't launch settings, activity not found from context");
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(du0 du0Var, c8e.NUlFixed nUl, z80 z80Var) throws Throwable {
        PljG pljG;
        fcT fct;
        cu0 cu0Var;
        if (z80Var instanceof PljG) {
            pljG = (PljG) z80Var;
            int i = pljG.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                pljG.E = i - Integer.MIN_VALUE;
            } else {
                pljG = new PljG(this, z80Var);
            }
        } else {
            pljG = new PljG(this, z80Var);
        }
        Object objD0 = pljG.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = pljG.E;
        if (i2 != 0) {
            if (i2 == 1) {
                nUl = pljG.B;
                cu0 cu0Var2 = pljG.A;
                fct = pljG.z;
                C0239D.H(objD0);
                cu0Var = cu0Var2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objD0);
            }
            return sd5.a;
        }
        C0239D.H(objD0);
        pljG.z = this;
        pljG.A = du0Var;
        pljG.B = nUl;
        pljG.E = 1;
        qh0 qh0Var = rl0.a;
        objD0 = fp1.D0(n72.a, new YtOM(this, null), pljG);
        if (objD0 == va0Var) {
            return va0Var;
        }
        fct = this;
        cu0Var = du0Var;
        if (((Boolean) objD0).booleanValue()) {
            int iOrdinal = nUl.a.ordinal();
            if (iOrdinal == 0) {
                VV4.LPt6Fixed lPt6 = new VV4.LPt6Fixed(Qx0$.QnHx.a);
                pljG.z = null;
                pljG.A = null;
                pljG.B = null;
                pljG.E = 2;
                if (cu0Var.n(lPt6, pljG) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            if (iOrdinal == 1) {
                fct.c.invoke(rPO.CQf.a);
            }
        }
        return sd5.a;
    }
}

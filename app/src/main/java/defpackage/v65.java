package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v65 implements eo1<p65, Object, q65> {
    public final lKy3 a;

    public v65(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        String str;
        p65 p65Var = (p65) obj;
        if (p65Var instanceof p65.CQf) {
            go1Var.p("initialize", new t65(null, this));
        } else {
            if (!(p65Var instanceof p65.QnHx)) {
                if (!(p65Var instanceof p65.F1)) {
                    throw new NoWhenBranchMatchedException();
                }
                sd5 sd5VarS = go1Var.s(new u65(p65Var));
                return sd5VarS == va0.COROUTINE_SUSPENDED ? sd5VarS : sd5.a;
            }
            r65 r65Var = ((p65.QnHx) p65Var).a;
            a62 a62Var = a62.a;
            int iOrdinal = r65Var.c.ordinal();
            String str2 = "system";
            if (iOrdinal == 0) {
                str = "dark";
            } else if (iOrdinal == 1) {
                str = "light";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "system";
            }
            a62Var.h("settings", "changed_theme", str);
            l65 l65Var = r65Var.c;
            int iOrdinal2 = l65Var.ordinal();
            if (iOrdinal2 == 0) {
                str2 = "dark";
            } else if (iOrdinal2 == 1) {
                str2 = "light";
            } else if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a62Var.j("theme", str2);
            lKy3 lky3 = this.a;
            lky3.getClass();
            lky3.h(l65Var.w, "THEME_PREF");
            go1Var.q();
        }
        return sd5.a;
    }
}

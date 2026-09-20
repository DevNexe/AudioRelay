package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b31 {
    public static final b31 b = new b31();
    public final ui2<e31> a = new ui2<>(new e31[16]);

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    public final void a() {
        kz1 kz1Var;
        yy1 yy1VarS;
        yy1 yy1VarS2;
        ui2<e31> ui2Var = this.a;
        if (!ui2Var.k()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int i = ui2Var.y;
        if (i > 0) {
            e31[] e31VarArr = ui2Var.w;
            int i2 = 0;
            do {
                ui2<r21> ui2Var2 = e31VarArr[i2].x;
                int i3 = ui2Var2.y;
                r21 r21Var = null;
                if (i3 > 0) {
                    r21[] r21VarArr = ui2Var2.w;
                    int i4 = 0;
                    do {
                        r21 r21Var2 = r21VarArr[i4];
                        if (r21Var == null || (kz1Var = r21Var.H) == null || (yy1VarS = kz1Var.A) == null) {
                            r21Var = r21Var2;
                        } else {
                            kz1 kz1Var2 = r21Var2.H;
                            if (kz1Var2 != null && (yy1VarS2 = kz1Var2.A) != null) {
                                while (yy1VarS.D > yy1VarS2.D) {
                                    yy1VarS = yy1VarS.s();
                                }
                                while (yy1VarS2.D > yy1VarS.D) {
                                    yy1VarS2 = yy1VarS2.s();
                                }
                                while (!ur1.a(yy1VarS.s(), yy1VarS2.s())) {
                                    yy1VarS = yy1VarS.s();
                                    yy1VarS2 = yy1VarS2.s();
                                }
                                ui2<yy1> ui2VarV = yy1VarS.s().v();
                                if (ui2VarV.h(yy1VarS) >= ui2VarV.h(yy1VarS2)) {
                                    r21Var = r21Var2;
                                }
                            }
                        }
                        i4++;
                    } while (i4 < i3);
                }
                if (r21Var != null) {
                    OW8.t(r21Var);
                }
                i2++;
            } while (i2 < i);
        }
    }
}

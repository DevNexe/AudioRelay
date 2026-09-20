package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class uh0 implements qh4 {
    public static qg4 b(m57 m57Var) {
        qg4.CQf cQf = new qg4.CQf(8);
        qg4.QnHx qnHx = new qg4.QnHx(true, false);
        m57Var.getClass();
        return new qg4(System.currentTimeMillis() + ((long) 3600000), cQf, qnHx, 10.0d, 1.2d, 60);
    }

    @Override // defpackage.qh4
    public final qg4 a(m57 m57Var, JSONObject jSONObject) {
        return b(m57Var);
    }
}

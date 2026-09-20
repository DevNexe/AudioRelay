package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xt2 extends cx1 implements x81<String, String, sd5> {
    public final /* synthetic */ cp3.QnHx w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(cp3.QnHx qnHx) {
        super(2);
        this.w = qnHx;
    }

    @Override // defpackage.x81
    public final sd5 invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        List<String> list = rf1.a;
        if (!ur1.a(str3, "Content-Length")) {
            nc1.QnHx qnHx = this.w.c;
            qnHx.getClass();
            nc1.CQf.a(str3);
            nc1.CQf.b(str4, str3);
            qnHx.a(str3, str4);
        }
        return sd5.a;
    }
}

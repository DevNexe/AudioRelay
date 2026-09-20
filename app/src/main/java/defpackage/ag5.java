package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ag5 extends cx1 implements x81<String, List<? extends String>, sd5> {
    public final /* synthetic */ x81<String, String, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag5(xt2 xt2Var) {
        super(2);
        this.w = xt2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(String str, List<? extends String> list) {
        String str2 = str;
        List<? extends String> list2 = list;
        List<String> list3 = rf1.a;
        if (!ur1.a("Content-Length", str2) && !ur1.a("Content-Type", str2)) {
            boolean zContains = bg5.a.contains(str2);
            x81<String, String, sd5> x81Var = this.w;
            if (zContains) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    x81Var.invoke(str2, (String) it.next());
                }
            } else {
                x81Var.invoke(str2, wu.M0(list2, ",", null, null, null, 62));
            }
        }
        return sd5.a;
    }
}

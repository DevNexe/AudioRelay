package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc4 implements ba {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ nc4(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.ba
    public final Object apply(Object obj, Object obj2) {
        switch (this.w) {
            case 0:
                List list = (List) obj;
                mc4.QnHx qnHx = (mc4.QnHx) obj2;
                if (qnHx instanceof mc4.QnHx.C0168QnHx) {
                    return qnHx;
                }
                if (!(qnHx instanceof mc4.QnHx.CQf)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (list.isEmpty()) {
                    return new mc4.QnHx.CQf(cs0.w);
                }
                List<mc4.CQf> list2 = ((mc4.QnHx.CQf) qnHx).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!list.contains(((mc4.CQf) obj3).a)) {
                        arrayList.add(obj3);
                    }
                }
                return new mc4.QnHx.CQf(arrayList);
            case 1:
                b63 b63Var = (b63) obj2;
                Sb1 sb1 = null;
                s50 s50Var = (s50) ((Optional) obj).orElse(null);
                if (!ur1.a(b63Var, b63.QnHx.a) && !ur1.a(b63Var, b63.F1.a)) {
                    if (!(b63Var instanceof b63.CQf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb1 = ((b63.CQf) b63Var).a;
                }
                return new u50(s50Var, sb1);
            case 2:
                Optional optional = (Optional) obj;
                y73 y73Var = (y73) obj2;
                if (y73Var instanceof y73.QnHx) {
                    return new bl("", ((y73.QnHx) y73Var).b.a, y73Var);
                }
                if (!(y73Var instanceof y73.LPt8Fixed)) {
                    return new bl("", "", y73Var);
                }
                Optional map = optional.map(new my3(1));
                return new bl(map.isPresent() ? ((h04) map.get()).a : "", ((y73.LPt8Fixed) y73Var).b.a, y73Var);
            default:
                pb pbVar = (pb) this.x;
                jc jcVar = (jc) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean z = jcVar instanceof jc.QnHx;
                Context context = pbVar.a;
                if (z) {
                    String string = ((jc.QnHx) jcVar).a;
                    if (string == null) {
                        string = context.getString(R.string.generic_bluetooth_headset);
                    }
                    return new pb.QnHx.CQf(string, zBooleanValue, true, false, false);
                }
                if (jcVar instanceof jc.CQf) {
                    jc.CQf cQf = (jc.CQf) jcVar;
                    String string2 = cQf.a;
                    if (string2 == null) {
                        string2 = context.getString(R.string.generic_bluetooth_headset);
                    }
                    return new pb.QnHx.CQf(string2, zBooleanValue, false, cQf.b, cQf.c);
                }
                if (ur1.a(jcVar, jc.LPt8Fixed.a)) {
                    return pb.QnHx.F1.a;
                }
                if (ur1.a(jcVar, jc.F1.a)) {
                    return pb.QnHx.F1.a;
                }
                if (ur1.a(jcVar, jc.YKK.a)) {
                    return pb.QnHx.F1.a;
                }
                if (ur1.a(jcVar, jc.auxFixed.a)) {
                    return pb.QnHx.F1.a;
                }
                if (ur1.a(jcVar, jc.NUlFixed.a)) {
                    return pb.QnHx.C0181QnHx.a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}

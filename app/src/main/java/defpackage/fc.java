package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.android.billingclient.api.Purchase;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fc(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) throws IOException {
        int i = this.w;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                hc hcVar = (hc) obj3;
                if (!((BluetoothAdapter) obj2).getProfileProxy(hcVar.a, hcVar.g, 1)) {
                    a62.a.e("failed_to_connect_to_bluetooth_profile");
                }
                break;
            case 1:
            default:
                Throwable th = (Throwable) obj;
                ((ps) obj3).a.close();
                ((re4) obj2).g.a(new pe4(th));
                a62.a.b("Initial TCP communication failed", th);
                break;
            case 2:
                pa paVar = (pa) obj3;
                yg3 yg3Var = (yg3) obj2;
                List list = (List) obj;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if ((((Purchase) it.next()).c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 2) {
                            z = true;
                        }
                    }
                }
                i03 i03Var = paVar.d;
                if (!z) {
                    i03Var.getClass();
                    int iOrdinal = yg3Var.ordinal();
                    if (iOrdinal == 0) {
                        i03Var.a.g(Boolean.FALSE);
                        break;
                    } else if (iOrdinal == 1) {
                        i03Var.b.g(Boolean.FALSE);
                        break;
                    }
                } else {
                    i03Var.getClass();
                    int iOrdinal2 = yg3Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i03Var.a.g(Boolean.TRUE);
                        break;
                    } else if (iOrdinal2 == 1) {
                        i03Var.b.g(Boolean.TRUE);
                        break;
                    }
                }
                break;
            case 3:
                pb4 pb4Var = (pb4) obj3;
                ob4 ob4Var = new ob4(pb4Var, (Sb1) obj);
                ad4 ad4Var = pb4Var.b;
                je4 je4Var = ((se4) obj2).a;
                ad4Var.getClass();
                ad2.CQf cQfW0 = ad2.w0();
                ob4Var.invoke(cQfW0);
                ad4Var.a(new uf4(je4Var, cQfW0.build()));
                break;
            case 4:
                ((xc4) obj3).a.a(new xe4(((se4) obj2).a, (ad2) obj));
                break;
        }
    }
}

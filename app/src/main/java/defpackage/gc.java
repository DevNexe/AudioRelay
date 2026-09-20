package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ gc(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        switch (this.w) {
            case 0:
                hc hcVar = (hc) this.x;
                ((BluetoothAdapter) this.y).getProfileProxy(hcVar.a, hcVar.g, 1);
                break;
            case 1:
                c2 c2Var = (c2) this.x;
                c2 c2Var2 = (c2) this.y;
                Throwable th = (Throwable) obj;
                c2Var.a(new qb4(th));
                c2Var2.a(new rb4(th));
                break;
            case 2:
                ye4 ye4Var = (ye4) this.x;
                se4 se4Var = (se4) this.y;
                ad4 ad4Var = ye4Var.a;
                je4 je4Var = se4Var.a;
                ad4Var.getClass();
                ad4Var.a(new uf4(je4Var, (ad2) obj));
                break;
            default:
                p33 p33Var = (p33) this.x;
                DatagramSocket datagramSocket = (DatagramSocket) this.y;
                List list = (List) obj;
                List<l33> list2 = p33Var.d;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    DatagramPacket datagramPacket = list2.get(i).b;
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            qk qkVar = (qk) list.get(i2);
                            datagramPacket.setData(qkVar.a, qkVar.b, qkVar.c);
                            datagramSocket.send(datagramPacket);
                        }
                    } catch (Throwable th2) {
                        if (!datagramSocket.isClosed()) {
                            p33Var.f.a(new n33(datagramPacket, th2));
                            p33Var.e.a(new o33(th2));
                        }
                    }
                }
                break;
        }
    }
}

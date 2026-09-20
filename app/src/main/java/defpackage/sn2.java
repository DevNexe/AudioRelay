package defpackage;

import android.media.AudioRecord;
import java.net.DatagramSocket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn2 implements m70 {
    public final /* synthetic */ int w;

    public /* synthetic */ sn2(int i) {
        this.w = i;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        switch (this.w) {
            case 0:
                a62.a.e("try_restart");
                break;
            case 1:
                a62 a62Var = a62.a;
                a62.a.d((Throwable) obj, true);
                break;
            case 2:
                ((ss) obj).close();
                break;
            case 3:
                ((AudioRecord) obj).release();
                break;
            case 4:
                a62.a.b("Failed to enable sco", (Throwable) obj);
                break;
            default:
                ((DatagramSocket) obj).close();
                break;
        }
    }
}

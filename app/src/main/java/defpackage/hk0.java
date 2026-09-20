package defpackage;

import androidx.profileinstaller.CQf;
import androidx.profileinstaller.QnHx;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hk0(int i, int i2, Object obj, Serializable serializable) {
        this.w = i2;
        this.z = obj;
        this.x = i;
        this.y = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.y;
        int i2 = this.x;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                ((QnHx) obj2).b.a(i2, obj);
                break;
            default:
                ((CQf.F1) obj2).a(i2, obj);
                break;
        }
    }
}

package defpackage;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk5 implements um {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sk5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.um
    public final void cancel() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ContentResolver) obj2).unregisterContentObserver((tk5.QnHx) obj);
                break;
            default:
                ((rk2) obj2).q.remove((rk2.CQf) obj);
                break;
        }
    }
}

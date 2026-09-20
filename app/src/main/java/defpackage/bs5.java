package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bs5 implements Runnable {
    public final /* synthetic */ String w;
    public final /* synthetic */ long x;
    public final /* synthetic */ id6 y;

    public bs5(id6 id6Var, String str, long j) {
        this.y = id6Var;
        this.w = str;
        this.x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id6 id6Var = this.y;
        id6Var.e();
        String str = this.w;
        oa3.e(str);
        Bt7j bt7j = id6Var.c;
        boolean zIsEmpty = bt7j.isEmpty();
        long j = this.x;
        if (zIsEmpty) {
            id6Var.d = j;
        }
        Integer num = (Integer) bt7j.getOrDefault(str, null);
        if (num != null) {
            bt7j.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (bt7j.y < 100) {
            bt7j.put(str, 1);
            id6Var.b.put(str, Long.valueOf(j));
        } else {
            bi6 bi6Var = id6Var.a.i;
            dq6.h(bi6Var);
            bi6Var.i.b("Too many ads visible");
        }
    }
}

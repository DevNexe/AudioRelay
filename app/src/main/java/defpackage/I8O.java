package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class I8O implements hw {
    public final lKy3 a;

    public /* synthetic */ I8O(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.hw
    public String a() {
        return this.a.f("last_server_address");
    }

    @Override // defpackage.hw
    public am b(float f, String str) {
        dG dGVar = new dG(this, str, f);
        int i = lKy3.w;
        return iE.b(this.a.j(str, null, dGVar));
    }

    @Override // defpackage.hw
    public am c(int i, String str) {
        DQ dq = new DQ(this, str, i);
        int i2 = lKy3.w;
        return iE.b(this.a.j(str, null, dq));
    }

    @Override // defpackage.hw
    public void d(String str, boolean z) {
        this.a.g(str, z);
    }

    @Override // defpackage.hw
    public am e(String str, String str2) {
        to toVar = new to(this, str, str2);
        int i = lKy3.w;
        return iE.b(this.a.j(str, null, toVar));
    }

    @Override // defpackage.hw
    public void f(String str, String str2) {
        this.a.i(str, str2);
    }

    @Override // defpackage.hw
    public am g(String str) {
        hZd hzd = new hZd(this, str);
        int i = lKy3.w;
        return iE.b(this.a.j(str, null, hzd));
    }

    @Override // defpackage.hw
    public void h(int i) {
        this.a.h(i, "gain_volume_amount_db");
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dn2 extends cx1 implements j81<String, Boolean> {
    public static final dn2 w = new dn2();

    public dn2() {
        super(1);
    }

    @Override // defpackage.j81
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!mv4.z(str, ':'));
    }
}

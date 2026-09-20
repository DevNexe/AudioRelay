package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an2 extends cx1 implements j81<String, Boolean> {
    public static final an2 w = new an2();

    public an2() {
        super(1);
    }

    @Override // defpackage.j81
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!mv4.z(str, ':'));
    }
}

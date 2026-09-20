package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends Rh {
    @Override // defpackage.Rh
    public final void a(int i) {
        throw new IllegalStateException("onFocusChange shouldn't be called on IgnoreAudioFocusStrategy".toString());
    }

    @Override // defpackage.Rh
    public final void b() {
        throw new IllegalStateException("onFocusRequestFailed shouldn't be called on IgnoreAudioFocusStrategy".toString());
    }

    @Override // defpackage.Rh
    public final boolean d() {
        return false;
    }
}

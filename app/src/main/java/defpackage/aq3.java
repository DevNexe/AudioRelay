package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aq3 extends Rh {
    public final CWg a;

    public aq3(CWg cWg) {
        this.a = cWg;
    }

    @Override // defpackage.Rh
    public final void a(int i) {
        throw new IllegalStateException("onFocusChange shouldn't be called on PhoneCallFixAudioFocusStrategy2".toString());
    }

    @Override // defpackage.Rh
    public final void b() {
        throw new IllegalStateException("onFocusRequestFailed shouldn't be called on PhoneCallFixAudioFocusStrategy2".toString());
    }

    @Override // defpackage.Rh
    public final void c(int i) {
        if (i == 1 || i == 2) {
            a62.a.i(i, "restart_audio_output_on_phone_call");
            this.a.a(new bq3());
        }
    }

    @Override // defpackage.Rh
    public final boolean d() {
        return false;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wp3 extends Rh {
    public final ln2 a;
    public final LHM b;

    public wp3(ln2 ln2Var, LHM lhm) {
        this.a = ln2Var;
        this.b = lhm;
    }

    @Override // defpackage.Rh
    public final void a(int i) {
        if (i == -3) {
            synchronized (this) {
                a62 a62Var = a62.a;
                a62Var.e("audiofocus_loss_transient_can_duck");
                a62Var.c("Lowered the volume as another app is temporarily playing audio");
                this.a.setVolume(0.3f);
                sd5 sd5Var = sd5.a;
            }
            return;
        }
        if (i == -2) {
            synchronized (this) {
                a62 a62Var2 = a62.a;
                a62Var2.e("audiofocus_loss_transient");
                a62Var2.c("Muted the audio as another app is temporarily playing audio");
                this.a.k();
                sd5 sd5Var2 = sd5.a;
            }
            return;
        }
        if (i == -1) {
            synchronized (this) {
                a62 a62Var3 = a62.a;
                a62Var3.e("audiofocus_loss");
                a62Var3.c("Stopped playback as another app is playing audio");
                j54.c.b(new u85(this, 5));
            }
            return;
        }
        if (i != 1) {
            return;
        }
        synchronized (this) {
            a62 a62Var4 = a62.a;
            a62Var4.e("audiofocus_gain");
            a62Var4.c("Restored the volume");
            this.a.setVolume(1.0f);
            sd5 sd5Var3 = sd5.a;
        }
    }

    @Override // defpackage.Rh
    public final void b() {
        j54.c.b(new eLUR(this, 2));
    }

    @Override // defpackage.Rh
    public final boolean d() {
        return true;
    }
}

package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class c42 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ e42 w;

    public c42(e42 e42Var) {
        this.w = e42Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        zp0 zp0Var;
        if (i == -1 || (zp0Var = this.w.y) == null) {
            return;
        }
        zp0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

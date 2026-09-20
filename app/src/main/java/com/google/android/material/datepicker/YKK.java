package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.wu2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class YKK implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView w;
    public final /* synthetic */ auxFixed x;

    public YKK(auxFixed auxVar, MaterialCalendarGridView materialCalendarGridView) {
        this.x = auxVar;
        this.w = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.w;
        NUlFixed adapter = materialCalendarGridView.getAdapter();
        if (i >= adapter.a() && i <= adapter.c()) {
            F1.LPt8Fixed lPt8 = this.x.f;
            long jLongValue = materialCalendarGridView.getAdapter().getItem(i).longValue();
            F1 f1 = F1.this;
            if (f1.r0.y.p(jLongValue)) {
                f1.q0.d();
                Iterator it = f1.o0.iterator();
                while (it.hasNext()) {
                    ((wu2) it.next()).a(f1.q0.c());
                }
                f1.w0.getAdapter().a.b();
                RecyclerView recyclerView = f1.v0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}

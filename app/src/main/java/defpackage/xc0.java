package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends Filter {
    public final QnHx a;

    public interface QnHx {
    }

    public xc0(QnHx qnHx) {
        this.a = qnHx;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((vw4) this.a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        vw4 vw4Var = (vw4) this.a;
        if (charSequence == null) {
            string = "";
        } else {
            vw4Var.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = vw4Var.G;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = vw4Var.g(vw4Var.H, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        QnHx qnHx = this.a;
        Cursor cursor = ((wc0) qnHx).y;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((vw4) qnHx).b((Cursor) obj);
    }
}

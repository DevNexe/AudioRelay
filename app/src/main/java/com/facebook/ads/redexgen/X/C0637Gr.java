package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0637Gr {
    public static byte[] A07;
    public static String[] A08 = {"0rGqU9QbqgRhw9xCYiy2ikjdJF0tZxW0", "O5zJjRmwn", "Zuwvbdj2tlT5lxRkpa9deVxz18dZQdtj", "3cu9YvSu9oYTgNu7SXt0BZa9RO8c3dJe", "fSpgVoQESo9i788g3Yt2BRpnP7rxN0lE", "PNJ5rPmEA0nUP9bGeJM8wQu7KuAYrDy", "AGqKR696jXLUBqkrCQSQW886irj6NtRI", "IRr9cxFu4Mtz1eOchhtcqFpk7Zjv6sDY"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C0629Gj A04;
    public final C0630Gk A05;
    public final C0636Gq A06;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
            String[] strArr = A08;
            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "o838eL9fL";
            strArr2[5] = "J6qCpr7RcsAqb79Ub3PrHCSZxMucifP";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-109, -80, -61, -80, 111, -75, -72, -76, -69, -77, 111, -69, -76, -67, -74, -61, -73, 111, -76, -57, -78, -76, -76, -77, -62, 111, -69, -72, -68, -72, -61, -16, 34, 14, -4, 13, 30, 31, 17, 30};
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0637Gr(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0630Gk(719, 575, 0, 719, 0, 575);
        this.A04 = new C0629Gj(0, A0F(), A0G(), A0H());
        this.A06 = new C0636Gq(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0678Ii c0678Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        int column = 0;
        do {
            int runLength = 0;
            int iA04 = c0678Ii.A04(2);
            if (iA04 != 0) {
                runLength = 1;
            } else {
                boolean zA0F = c0678Ii.A0F();
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "NWJ2j8DR8";
                strArr2[5] = "tuFwEgjWv5QsbV2rgY7O01mW2P3xd0b";
                if (zA0F) {
                    runLength = c0678Ii.A04(3) + 3;
                    iA04 = c0678Ii.A04(2);
                } else if (c0678Ii.A0F()) {
                    runLength = 1;
                    iA04 = 0;
                } else {
                    int iA05 = c0678Ii.A04(2);
                    if (iA05 == 0) {
                        column = 1;
                        iA04 = 0;
                    } else if (iA05 != 1) {
                        if (iA05 == 2) {
                            runLength = c0678Ii.A04(4) + 12;
                            iA04 = c0678Ii.A04(2);
                        } else if (iA05 != 3) {
                            iA04 = 0;
                        } else {
                            int iA06 = c0678Ii.A04(8);
                            String[] strArr3 = A08;
                            if (strArr3[1].length() == strArr3[5].length()) {
                                String[] strArr4 = A08;
                                strArr4[1] = "EWrEb5ztJ";
                                strArr4[5] = "osfW1bR5YMm4TxT0YESgxQn9EHcmZGy";
                                runLength = iA06 + 12;
                                iA04 = c0678Ii.A04(2);
                            } else {
                                A08[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                runLength = iA06 + 29;
                                iA04 = c0678Ii.A04(2);
                            }
                        }
                    } else {
                        runLength = 2;
                        iA04 = 0;
                    }
                }
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(i3, i2, i3 + runLength, i2 + 1, paint);
            }
            i3 += runLength;
        } while (column == 0);
        return i3;
    }

    public static int A02(C0678Ii c0678Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int runLength = i;
        int column = 0;
        do {
            int clutIndex = 0;
            int iA04 = c0678Ii.A04(4);
            if (iA04 != 0) {
                clutIndex = 1;
            } else if (!c0678Ii.A0F()) {
                int iA05 = c0678Ii.A04(3);
                if (iA05 != 0) {
                    clutIndex = iA05 + 2;
                    iA04 = 0;
                } else {
                    column = 1;
                    iA04 = 0;
                }
            } else if (!c0678Ii.A0F()) {
                clutIndex = c0678Ii.A04(2) + 4;
                iA04 = c0678Ii.A04(4);
            } else {
                int iA06 = c0678Ii.A04(2);
                if (iA06 == 0) {
                    clutIndex = 1;
                    iA04 = 0;
                } else if (iA06 == 1) {
                    clutIndex = 2;
                    iA04 = 0;
                } else if (iA06 == 2) {
                    clutIndex = c0678Ii.A04(4) + 9;
                    iA04 = c0678Ii.A04(4);
                } else if (iA06 != 3) {
                    iA04 = 0;
                } else {
                    clutIndex = c0678Ii.A04(8) + 25;
                    iA04 = c0678Ii.A04(4);
                }
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(runLength, i2, runLength + clutIndex, i2 + 1, paint);
            }
            runLength += clutIndex;
        } while (column == 0);
        return runLength;
    }

    public static int A03(C0678Ii c0678Ii, int[] iArr, @Nullable byte[] bArr, int i, int peek, Paint paint, Canvas canvas) {
        int iA04;
        int runLength = i;
        int column = 0;
        do {
            int iA05 = c0678Ii.A04(8);
            if (iA05 != 0) {
                iA04 = 1;
            } else if (!c0678Ii.A0F()) {
                iA04 = c0678Ii.A04(7);
                if (iA04 != 0) {
                    iA05 = 0;
                } else {
                    column = 1;
                    iA04 = 0;
                    iA05 = 0;
                }
            } else {
                iA04 = c0678Ii.A04(7);
                iA05 = c0678Ii.A04(8);
                String[] strArr = A08;
                if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                    A08[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
                }
                throw new RuntimeException();
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA05 = bArr[iA05];
                }
                paint.setColor(iArr[iA05]);
                canvas.drawRect(runLength, peek, runLength + iA04, peek + 1, paint);
            }
            runLength += iA04;
            String[] strArr2 = A08;
            if (strArr2[1].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[6] = "jmdilAXdKLha38CDbN17xGIpmuplWnFc";
            strArr3[3] = "1PNl1axnrexK2c7Nxi5CJrHaXY90XFpd";
        } while (column == 0);
        return runLength;
    }

    public static C0629Gj A04(C0678Ii c0678Ii, int i) {
        int[] iArr;
        int iA04;
        int clutId;
        int iA05;
        int cb;
        int b = 8;
        int iA06 = c0678Ii.A04(8);
        c0678Ii.A08(8);
        int i2 = i - 2;
        int[] clutEntries8Bit = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i2 > 0) {
            int r = c0678Ii.A04(b);
            int t = c0678Ii.A04(b);
            int y = i2 - 2;
            if ((t & 128) != 0) {
                iArr = clutEntries8Bit;
            } else {
                int cr = t & 64;
                if (cr != 0) {
                    iArr = iArrA0G;
                } else {
                    iArr = iArrA0H;
                }
            }
            if ((t & 1) != 0) {
                iA04 = c0678Ii.A04(b);
                clutId = c0678Ii.A04(b);
                iA05 = c0678Ii.A04(b);
                cb = c0678Ii.A04(b);
                i2 = y - 4;
            } else {
                iA04 = c0678Ii.A04(6) << 2;
                int remainingLength = c0678Ii.A04(4);
                clutId = remainingLength << 4;
                int cr2 = c0678Ii.A04(4);
                iA05 = cr2 << 4;
                int cr3 = c0678Ii.A04(2);
                cb = cr3 << 6;
                i2 = y - 2;
            }
            if (iA04 == 0) {
                clutId = 0;
                iA05 = 0;
                cb = 255;
            }
            byte b2 = (byte) (255 - (cb & 255));
            int a = clutId - 128;
            int i3 = (int) (((double) iA04) + (((double) a) * 1.402d));
            int cb2 = iA05 - 128;
            double d = ((double) iA04) - (((double) cb2) * 0.34414d);
            int cb3 = clutId - 128;
            int i4 = (int) (d - (((double) cb3) * 0.71414d));
            int cb4 = iA05 - 128;
            int a2 = C0695Iz.A06(i3, 0, 255);
            int b3 = C0695Iz.A06(i4, 0, 255);
            iArr[r] = A00(b2, a2, b3, C0695Iz.A06((int) (((double) iA04) + (((double) cb4) * 1.772d)), 0, 255));
            b = 8;
        }
        return new C0629Gj(iA06, clutEntries8Bit, iArrA0G, iArrA0H);
    }

    public static C0630Gk A05(C0678Ii c0678Ii) {
        int verticalPositionMinimum;
        int width;
        int verticalPositionMaximum;
        int height;
        c0678Ii.A08(4);
        boolean zA0F = c0678Ii.A0F();
        c0678Ii.A08(3);
        int iA04 = c0678Ii.A04(16);
        int iA05 = c0678Ii.A04(16);
        if (zA0F) {
            verticalPositionMinimum = c0678Ii.A04(16);
            verticalPositionMaximum = c0678Ii.A04(16);
            width = c0678Ii.A04(16);
            height = c0678Ii.A04(16);
        } else {
            verticalPositionMinimum = 0;
            width = 0;
            verticalPositionMaximum = iA04;
            height = iA05;
        }
        return new C0630Gk(iA04, iA05, verticalPositionMinimum, verticalPositionMaximum, width, height);
    }

    public static C0631Gl A06(C0678Ii c0678Ii) {
        int objectCodingMethod = c0678Ii.A04(16);
        c0678Ii.A08(4);
        int iA04 = c0678Ii.A04(2);
        boolean zA0F = c0678Ii.A0F();
        c0678Ii.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (iA04 == 1) {
            c0678Ii.A08(c0678Ii.A04(8) * 16);
        } else if (iA04 == 0) {
            int iA05 = c0678Ii.A04(16);
            int objectId = c0678Ii.A04(16);
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[0];
            int iCharAt = str.charAt(19);
            int topFieldDataLength = str2.charAt(19);
            if (iCharAt != topFieldDataLength) {
                throw new RuntimeException();
            }
            A08[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            if (iA05 > 0) {
                bArr = new byte[iA05];
                c0678Ii.A0E(bArr, 0, iA05);
            }
            if (objectId > 0) {
                bArr2 = new byte[objectId];
                c0678Ii.A0E(bArr2, 0, objectId);
            } else {
                bArr2 = bArr;
            }
        }
        return new C0631Gl(objectCodingMethod, zA0F, bArr, bArr2);
    }

    public static C0632Gm A07(C0678Ii c0678Ii, int timeoutSecs) {
        int remainingLength = c0678Ii.A04(8);
        int iA04 = c0678Ii.A04(4);
        int iA05 = c0678Ii.A04(2);
        c0678Ii.A08(2);
        int regionHorizontalAddress = timeoutSecs - 2;
        SparseArray sparseArray = new SparseArray();
        while (regionHorizontalAddress > 0) {
            int iA06 = c0678Ii.A04(8);
            c0678Ii.A08(8);
            regionHorizontalAddress -= 6;
            sparseArray.put(iA06, new C0633Gn(c0678Ii.A04(16), c0678Ii.A04(16)));
        }
        return new C0632Gm(remainingLength, iA04, iA05, sparseArray);
    }

    public static C0634Go A08(C0678Ii c0678Ii, int i) {
        int i2 = 8;
        int iA04 = c0678Ii.A04(8);
        c0678Ii.A08(4);
        boolean zA0F = c0678Ii.A0F();
        c0678Ii.A08(3);
        int iA05 = c0678Ii.A04(16);
        int iA06 = c0678Ii.A04(16);
        int iA07 = c0678Ii.A04(3);
        int iA08 = c0678Ii.A04(3);
        c0678Ii.A08(2);
        int id = c0678Ii.A04(8);
        int iA09 = c0678Ii.A04(8);
        int width = c0678Ii.A04(4);
        int height = c0678Ii.A04(2);
        c0678Ii.A08(2);
        int pixelCode8Bit = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (pixelCode8Bit > 0) {
            int pixelCode4Bit = c0678Ii.A04(16);
            int pixelCode2Bit = c0678Ii.A04(2);
            int remainingLength = c0678Ii.A04(2);
            int objectHorizontalPosition = c0678Ii.A04(12);
            c0678Ii.A08(4);
            int objectVerticalPosition = c0678Ii.A04(12);
            pixelCode8Bit -= 6;
            int remainingLength2 = 0;
            int objectType = 0;
            if (pixelCode2Bit == 1 || pixelCode2Bit == 2) {
                remainingLength2 = c0678Ii.A04(i2);
                objectType = c0678Ii.A04(i2);
                pixelCode8Bit -= 2;
                int objectProvider = A08[2].charAt(23);
                if (objectProvider == 111) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[4] = "2juIiSC4ZxHJWLrTtxN2ANki5argYjtZ";
                strArr[0] = "MWq7TNsVs7aXK0A5Gh22llfb9AkLnJo6";
            }
            sparseArray.put(pixelCode4Bit, new C0635Gp(pixelCode2Bit, remainingLength, objectHorizontalPosition, objectVerticalPosition, remainingLength2, objectType));
            i2 = 8;
        }
        return new C0634Go(iA04, zA0F, iA05, iA06, iA07, iA08, id, iA09, width, height, sparseArray);
    }

    public static void A0B(C0631Gl c0631Gl, C0629Gj c0629Gj, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0629Gj.A03;
        } else if (i == 2) {
            iArr = c0629Gj.A02;
        } else {
            iArr = c0629Gj.A01;
        }
        A0D(c0631Gl.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c0631Gl.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0C(C0678Ii c0678Ii, C0636Gq c0636Gq) {
        int dataFieldLimit = c0678Ii.A04(8);
        int iA04 = c0678Ii.A04(16);
        int iA05 = c0678Ii.A04(16);
        int iA02 = c0678Ii.A02() + iA05;
        int i = iA05 * 8;
        int pageId = c0678Ii.A01();
        if (i > pageId) {
            Log.w(A09(31, 9, 98), A09(0, 31, 5));
            int pageId2 = c0678Ii.A01();
            c0678Ii.A08(pageId2);
            return;
        }
        switch (dataFieldLimit) {
            case 16:
                if (iA04 == c0636Gq.A03) {
                    C0632Gm c0632Gm = c0636Gq.A01;
                    C0632Gm c0632GmA07 = A07(c0678Ii, iA05);
                    if (c0632GmA07.A00 != 0) {
                        c0636Gq.A01 = c0632GmA07;
                        c0636Gq.A08.clear();
                        c0636Gq.A06.clear();
                        c0636Gq.A07.clear();
                    } else if (c0632Gm != null && c0632Gm.A02 != c0632GmA07.A02) {
                        c0636Gq.A01 = c0632GmA07;
                    }
                }
                break;
            case 17:
                C0632Gm c0632Gm2 = c0636Gq.A01;
                if (iA04 == c0636Gq.A03 && c0632Gm2 != null) {
                    C0634Go c0634GoA08 = A08(c0678Ii, iA05);
                    if (c0632Gm2.A00 == 0) {
                        c0634GoA08.A00(c0636Gq.A08.get(c0634GoA08.A03));
                    }
                    c0636Gq.A08.put(c0634GoA08.A03, c0634GoA08);
                }
                break;
            case 18:
                int i2 = c0636Gq.A03;
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "mRSclinCADIq46C9KldTbFaax6B9q8b4";
                strArr2[3] = "vFkDlZLj3MIArV1XHnB7DSJLlPCTmot7";
                if (iA04 == i2) {
                    C0629Gj c0629GjA04 = A04(c0678Ii, iA05);
                    c0636Gq.A06.put(c0629GjA04.A00, c0629GjA04);
                } else if (iA04 == c0636Gq.A02) {
                    C0629Gj c0629GjA05 = A04(c0678Ii, iA05);
                    c0636Gq.A04.put(c0629GjA05.A00, c0629GjA05);
                }
                break;
                break;
            case 19:
                int i3 = c0636Gq.A03;
                String[] strArr3 = A08;
                if (strArr3[6].charAt(3) == strArr3[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A08;
                strArr4[4] = "pcWRhVspQCHgNcWnX1u2k42jPLp60tyv";
                strArr4[0] = "kZn4JsYkhf5tuSMKkFW2HGy26pqZZVve";
                if (iA04 == i3) {
                    C0631Gl c0631GlA06 = A06(c0678Ii);
                    c0636Gq.A07.put(c0631GlA06.A00, c0631GlA06);
                } else if (iA04 == c0636Gq.A02) {
                    C0631Gl c0631GlA07 = A06(c0678Ii);
                    c0636Gq.A05.put(c0631GlA07.A00, c0631GlA07);
                }
                break;
                break;
            case 20:
                if (iA04 == c0636Gq.A03) {
                    c0636Gq.A00 = A05(c0678Ii);
                }
                break;
        }
        int pageId3 = c0678Ii.A02();
        c0678Ii.A09(iA02 - pageId3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    public static void A0D(byte[] bArr, int[] iArr, int i, int column, int i2, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        String[] strArr;
        int line = i2;
        C0678Ii c0678Ii = new C0678Ii(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] bArrA0E = null;
        int dataType = column;
        while (c0678Ii.A01() != 0) {
            int iA04 = c0678Ii.A04(8);
            if (iA04 != 240) {
                switch (iA04) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrA0E == null ? A0A : bArrA0E;
                        } else if (A08[2].charAt(23) != 'o') {
                            A08[7] = "hywEr7H1ZkU3fUIk8F5vLu65ATGZjfu1";
                            if (i == 2) {
                                if (clutMapTable2To8 == null) {
                                    bArr3 = A09;
                                } else {
                                    bArr3 = clutMapTable2To8;
                                }
                            } else {
                                bArr3 = null;
                                strArr = A08;
                                if (strArr[6].charAt(3) != strArr[3].charAt(3)) {
                                    String[] strArr2 = A08;
                                    strArr2[6] = "gux03qWXo9ty9zG4lbSXUGnB14yX0Pwl";
                                    strArr2[3] = "mOZXu8mKnzB6ItdLGIFDHc3IIcHjCnZN";
                                }
                            }
                        } else if (i == 2) {
                            if (clutMapTable2To8 == null) {
                                bArr3 = A09;
                            } else {
                                bArr3 = clutMapTable2To8;
                            }
                        } else {
                            bArr3 = null;
                            strArr = A08;
                            if (strArr[6].charAt(3) != strArr[3].charAt(3)) {
                                String[] strArr3 = A08;
                                strArr3[6] = "gux03qWXo9ty9zG4lbSXUGnB14yX0Pwl";
                                strArr3[3] = "mOZXu8mKnzB6ItdLGIFDHc3IIcHjCnZN";
                            }
                        }
                        dataType = A01(c0678Ii, iArr, bArr3, dataType, line, paint, canvas);
                        c0678Ii.A05();
                        break;
                    case 17:
                        if (i == 3) {
                            bArr2 = 0 == 0 ? A0B : null;
                        } else {
                            bArr2 = null;
                        }
                        dataType = A02(c0678Ii, iArr, bArr2, dataType, line, paint, canvas);
                        c0678Ii.A05();
                        break;
                    case 18:
                        dataType = A03(c0678Ii, iArr, null, dataType, line, paint, canvas);
                        break;
                    default:
                        String[] strArr4 = A08;
                        if (strArr4[1].length() == strArr4[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A08;
                        strArr5[6] = "nnJuFIsGV5CjoI7UJHQ2Bk6wbONoIcvD";
                        strArr5[3] = "B7N9QxouVzPbBX96zhiMkNdTz6ghfWa9";
                        switch (iA04) {
                            case 32:
                                clutMapTable2To8 = A0E(4, 4, c0678Ii);
                                break;
                            case 33:
                                bArrA0E = A0E(4, 8, c0678Ii);
                                break;
                            case 34:
                                bArrA0E = A0E(16, 8, c0678Ii);
                                break;
                        }
                        break;
                }
            } else {
                dataType = column;
                String[] strArr6 = A08;
                if (strArr6[6].charAt(3) == strArr6[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr7 = A08;
                strArr7[4] = "1Yb9cCeteR9nE6vKcNo2OEsJCpTNOHjW";
                strArr7[0] = "QaAoDeRqTjKpMwy1vMH2rkmGvn6a95yg";
                line += 2;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C0678Ii c0678Ii) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0678Ii.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < i; i++) {
            if (i < 8) {
                int i2 = i & 1;
                int i3 = i2 != 0 ? 255 : 0;
                int i4 = i & 2;
                int i5 = i4 != 0 ? 255 : 0;
                int i6 = i & 4;
                int i7 = i6 != 0 ? 255 : 0;
                iArr[i] = A00(255, i3, i5, i7);
            } else {
                int i8 = i & 1;
                int i9 = i8 != 0 ? 127 : 0;
                int i10 = i & 2;
                int i11 = i10 != 0 ? 127 : 0;
                int i12 = i & 4;
                int i13 = A00(255, i9, i11, i12 == 0 ? 0 : 127);
                iArr[i] = i13;
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    public static int[] A0H() {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (A08[7].charAt(0) != 'p') {
                A08[7] = "7y54aHaRl5REI13HJ3s1imsDPHbTblVp";
                if (i4 < 8) {
                    int i5 = i4 & 1;
                    int i6 = i5 != 0 ? 255 : 0;
                    int i7 = i4 & 2;
                    int i8 = i7 != 0 ? 255 : 0;
                    int i9 = i4 & 4;
                    int i10 = A00(63, i6, i8, i9 == 0 ? 0 : 255);
                    iArr[i4] = i10;
                } else {
                    int i11 = i4 & 136;
                    int i12 = 85;
                    if (i11 != 0) {
                        if (i11 == 8) {
                            int i13 = i4 & 1;
                            if (A08[2].charAt(23) != 'o') {
                                String[] strArr = A08;
                                strArr[1] = "zD6Csp8ux";
                                strArr[5] = "ABdM1nmFS67IaChkXEo7C65oL6pHbci";
                                if (i13 != 0) {
                                    i2 = 85;
                                } else {
                                    i2 = 0;
                                }
                            } else if (i13 != 0) {
                                i2 = 85;
                            } else {
                                i2 = 0;
                            }
                            int i14 = i4 & 16;
                            int i15 = i14 != 0 ? 170 : 0;
                            int i16 = i2 + i15;
                            int i17 = i4 & 2;
                            int i18 = i17 != 0 ? 85 : 0;
                            int i19 = i4 & 32;
                            int i20 = i19 != 0 ? 170 : 0;
                            int i21 = i18 + i20;
                            int i22 = i4 & 4;
                            i12 = i22 == 0 ? 0 : 85;
                            int i23 = i4 & 64;
                            int iA00 = A00(127, i16, i21, i12 + (i23 == 0 ? 0 : 170));
                            String[] strArr2 = A08;
                            String str = strArr2[4];
                            String str2 = strArr2[0];
                            int iCharAt = str.charAt(19);
                            int i24 = str2.charAt(19);
                            if (iCharAt == i24) {
                                A08[7] = "bDBxdZVxANiceBpFScFowteWsfRZjeai";
                                iArr[i4] = iA00;
                            }
                        } else if (i11 == 128) {
                            int i25 = i4 & 1;
                            int i26 = (i25 != 0 ? 43 : 0) + 127;
                            if (A08[2].charAt(23) != 'o') {
                                String[] strArr3 = A08;
                                strArr3[6] = "8rwGXlyeTkBDctGAAe0ybw2U4QS8yLu8";
                                strArr3[3] = "b3XBP5juEUhRB0eBqHayBxF2ov8DVqZh";
                                int i27 = i4 & 16;
                                if (i27 != 0) {
                                    i3 = 85;
                                } else {
                                    i3 = 0;
                                }
                            } else {
                                int i28 = i4 & 16;
                                if (i28 != 0) {
                                    i3 = 85;
                                } else {
                                    i3 = 0;
                                }
                            }
                            int i29 = i26 + i3;
                            int i30 = i4 & 2;
                            int i31 = (i30 != 0 ? 43 : 0) + 127;
                            int i32 = i4 & 32;
                            int i33 = i32 != 0 ? 85 : 0;
                            int i34 = i31 + i33;
                            int i35 = i4 & 4;
                            int i36 = (i35 == 0 ? 0 : 43) + 127;
                            int i37 = i4 & 64;
                            int i38 = A00(255, i29, i34, i36 + (i37 == 0 ? 0 : 85));
                            iArr[i4] = i38;
                        } else if (i11 == 136) {
                            int i39 = i4 & 1;
                            int i40 = i39 != 0 ? 43 : 0;
                            int i41 = i4 & 16;
                            int i42 = i41 != 0 ? 85 : 0;
                            int i43 = i40 + i42;
                            int i44 = i4 & 2;
                            int i45 = i44 != 0 ? 43 : 0;
                            int i46 = i4 & 32;
                            int i47 = i46 != 0 ? 85 : 0;
                            int i48 = i45 + i47;
                            int i49 = i4 & 4;
                            int i50 = i49 == 0 ? 0 : 43;
                            int i51 = i4 & 64;
                            if (A08[7].charAt(0) != 'p') {
                                A08[7] = "rqpSBs3vuZ0ERZdVV6yaRn8vqIGdmkwB";
                                if (i51 == 0) {
                                    i12 = 0;
                                }
                            } else {
                                String[] strArr4 = A08;
                                strArr4[6] = "2QJGhvhuyca3nv8SEdFx1xy9G3klEgNt";
                                strArr4[3] = "r0SxrSAMbEoy1xhAukRyPN5ngWlJAOxP";
                                if (i51 == 0) {
                                    i12 = 0;
                                }
                            }
                            int i52 = A00(255, i43, i48, i50 + i12);
                            iArr[i4] = i52;
                        }
                    } else {
                        int i53 = i4 & 1;
                        int i54 = i53 != 0 ? 85 : 0;
                        int i55 = i4 & 16;
                        int i56 = i55 != 0 ? 170 : 0;
                        int i57 = i54 + i56;
                        int i58 = i4 & 2;
                        int i59 = i58 != 0 ? 85 : 0;
                        int i60 = i4 & 32;
                        String[] strArr5 = A08;
                        String str3 = strArr5[6];
                        String str4 = strArr5[3];
                        int iCharAt2 = str3.charAt(3);
                        int i61 = str4.charAt(3);
                        if (iCharAt2 != i61) {
                            A08[2] = "wHDyMipoRF4Sy41BpQnebh5fQe1LXtvR";
                            if (i60 != 0) {
                                i = 170;
                            } else {
                                i = 0;
                            }
                        } else if (i60 != 0) {
                            i = 170;
                        } else {
                            i = 0;
                        }
                        int i62 = i59 + i;
                        int i63 = i4 & 4;
                        i12 = i63 == 0 ? 0 : 85;
                        int i64 = i4 & 64;
                        int i65 = A00(255, i57, i62, i12 + (i64 == 0 ? 0 : 170));
                        iArr[i4] = i65;
                    }
                }
            }
            throw new RuntimeException();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0123 A[PHI: r3
  0x0123: PHI (r3v25 int) = (r3v15 int), (r3v29 int) binds: [B:71:0x028c, B:32:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:41:0x0168  */
    /* JADX WARN: Code duplicated, block: B:43:0x0171  */
    /* JADX WARN: Code duplicated, block: B:45:0x0187  */
    /* JADX WARN: Code duplicated, block: B:47:0x0193  */
    /* JADX WARN: Code duplicated, block: B:49:0x0197  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x0210  */
    /* JADX WARN: Code duplicated, block: B:62:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x021c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0232  */
    /* JADX WARN: Code duplicated, block: B:66:0x0237  */
    /* JADX WARN: Code duplicated, block: B:67:0x0249  */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:83:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab A[SYNTHETIC] */
    public final List<GX> A0I(byte[] bArr, int i) {
        C0630Gk displayDefinition;
        C0633Gn c0633GnValueAt;
        C0634Go c0634Go;
        int objectId;
        String[] strArr;
        int i2;
        C0629Gj c0629Gj;
        SparseArray<C0635Gp> sparseArray;
        int i3;
        int size;
        int[] iArr;
        String[] strArr2;
        int i4;
        int iKeyAt;
        C0635Gp c0635GpValueAt;
        C0631Gl c0631Gl;
        Paint paint;
        C0636Gq c0636Gq;
        String[] strArr3;
        C0678Ii c0678Ii = new C0678Ii(bArr, i);
        while (c0678Ii.A01() >= 48 && c0678Ii.A04(8) == 15) {
            A0C(c0678Ii, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C0630Gk c0630Gk = this.A06.A00;
        String[] strArr4 = A08;
        if (strArr4[1].length() != strArr4[5].length()) {
            String[] strArr5 = A08;
            strArr5[1] = "z8hrEfHRE";
            strArr5[5] = "tEcTk7NjBKTGmUTfvqHNNfUFGTzpRsq";
            if (c0630Gk != null) {
                displayDefinition = this.A06.A00;
            } else {
                displayDefinition = this.A05;
            }
            if (this.A00 == null || displayDefinition.A05 + 1 != this.A00.getWidth() || displayDefinition.A00 + 1 != this.A00.getHeight()) {
                this.A00 = Bitmap.createBitmap(displayDefinition.A05 + 1, displayDefinition.A00 + 1, Bitmap.Config.ARGB_8888);
                this.A01.setBitmap(this.A00);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<C0633Gn> sparseArray2 = this.A06.A01.A03;
            int i5 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                String[] strArr6 = A08;
                if (strArr6[6].charAt(3) != strArr6[3].charAt(3)) {
                    String[] strArr7 = A08;
                    strArr7[6] = "TprGMNp3AYOmeYIcCj9alnxqC4oFWUd6";
                    strArr7[3] = "Eq3XgCegRXd5fB5msr1SXwFGWzY9w5wa";
                    if (i5 >= size2) {
                        break;
                    }
                    c0633GnValueAt = sparseArray2.valueAt(i5);
                    c0634Go = this.A06.A08.get(sparseArray2.keyAt(i5));
                    objectId = c0633GnValueAt.A00 + displayDefinition.A02;
                    strArr = A08;
                    if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                        String[] strArr8 = A08;
                        strArr8[4] = "TY5GWswnGZgqU5TBTRN2XTUe2O3rblrN";
                        strArr8[0] = "yCdfjvFRPQZrw6b6gB422Kgbwhe9KBG1";
                        i2 = c0633GnValueAt.A01 + displayDefinition.A04;
                        this.A01.clipRect(objectId, i2, Math.min(c0634Go.A08 + objectId, displayDefinition.A01), Math.min(c0634Go.A02 + i2, displayDefinition.A03), Region.Op.REPLACE);
                        c0629Gj = this.A06.A06.get(c0634Go.A00);
                        if (c0629Gj == null) {
                            c0636Gq = this.A06;
                            strArr3 = A08;
                            if (strArr3[6].charAt(3) != strArr3[3].charAt(3)) {
                                String[] strArr9 = A08;
                                strArr9[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
                                strArr9[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            } else {
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            }
                        }
                    } else {
                        A08[2] = "9LKzldxuFJaIme257qc067WNURDIagQu";
                        i2 = c0633GnValueAt.A01 + displayDefinition.A04;
                        this.A01.clipRect(objectId, i2, Math.min(c0634Go.A08 + objectId, displayDefinition.A01), Math.min(c0634Go.A02 + i2, displayDefinition.A03), Region.Op.REPLACE);
                        c0629Gj = this.A06.A06.get(c0634Go.A00);
                        if (c0629Gj == null) {
                            c0636Gq = this.A06;
                            strArr3 = A08;
                            if (strArr3[6].charAt(3) != strArr3[3].charAt(3)) {
                                String[] strArr10 = A08;
                                strArr10[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
                                strArr10[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            } else {
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            }
                        }
                    }
                    sparseArray = c0634Go.A09;
                    i3 = 0;
                    while (true) {
                        size = sparseArray.size();
                        if (A08[2].charAt(23) != 'o') {
                            A08[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
                            if (i3 < size) {
                                iKeyAt = sparseArray.keyAt(i3);
                                c0635GpValueAt = sparseArray.valueAt(i3);
                                c0631Gl = this.A06.A07.get(iKeyAt);
                                if (c0631Gl == null) {
                                    c0631Gl = this.A06.A05.get(iKeyAt);
                                }
                                if (c0631Gl == null) {
                                    if (c0631Gl.A01) {
                                        paint = null;
                                    } else {
                                        paint = this.A02;
                                    }
                                    A0B(c0631Gl, c0629Gj, c0634Go.A01, objectId + c0635GpValueAt.A02, i2 + c0635GpValueAt.A05, paint, this.A01);
                                }
                                i3++;
                            }
                        }
                    }
                    if (!c0634Go.A0A) {
                        if (c0634Go.A01 == 3) {
                            i4 = c0629Gj.A03[c0634Go.A07];
                        } else if (c0634Go.A01 == 2) {
                            i4 = c0629Gj.A02[c0634Go.A06];
                        } else {
                            iArr = c0629Gj.A01;
                            strArr2 = A08;
                            if (strArr2[4].charAt(19) != strArr2[0].charAt(19)) {
                                i4 = iArr[c0634Go.A05];
                            } else {
                                String[] strArr11 = A08;
                                strArr11[1] = "SK7qwpqeD";
                                strArr11[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
                                i4 = iArr[c0634Go.A05];
                            }
                        }
                        this.A03.setColor(i4);
                        this.A01.drawRect(objectId, i2, c0634Go.A08 + objectId, c0634Go.A02 + i2, this.A03);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.A00, objectId, i2, c0634Go.A08, c0634Go.A02);
                    float f = objectId / displayDefinition.A05;
                    float f2 = i2 / displayDefinition.A00;
                    float f3 = c0634Go.A08 / displayDefinition.A05;
                    int color = c0634Go.A02;
                    float f4 = color;
                    int color2 = displayDefinition.A00;
                    arrayList.add(new GX(bitmapCreateBitmap, f, 0, f2, 0, f3, f4 / color2));
                    this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
                    i5++;
                } else {
                    if (i5 >= size2) {
                        break;
                    }
                    c0633GnValueAt = sparseArray2.valueAt(i5);
                    c0634Go = this.A06.A08.get(sparseArray2.keyAt(i5));
                    objectId = c0633GnValueAt.A00 + displayDefinition.A02;
                    strArr = A08;
                    if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                        String[] strArr12 = A08;
                        strArr12[4] = "TY5GWswnGZgqU5TBTRN2XTUe2O3rblrN";
                        strArr12[0] = "yCdfjvFRPQZrw6b6gB422Kgbwhe9KBG1";
                        i2 = c0633GnValueAt.A01 + displayDefinition.A04;
                        this.A01.clipRect(objectId, i2, Math.min(c0634Go.A08 + objectId, displayDefinition.A01), Math.min(c0634Go.A02 + i2, displayDefinition.A03), Region.Op.REPLACE);
                        c0629Gj = this.A06.A06.get(c0634Go.A00);
                        if (c0629Gj == null) {
                            c0636Gq = this.A06;
                            strArr3 = A08;
                            if (strArr3[6].charAt(3) != strArr3[3].charAt(3)) {
                                String[] strArr13 = A08;
                                strArr13[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
                                strArr13[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            } else {
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            }
                        }
                    } else {
                        A08[2] = "9LKzldxuFJaIme257qc067WNURDIagQu";
                        i2 = c0633GnValueAt.A01 + displayDefinition.A04;
                        this.A01.clipRect(objectId, i2, Math.min(c0634Go.A08 + objectId, displayDefinition.A01), Math.min(c0634Go.A02 + i2, displayDefinition.A03), Region.Op.REPLACE);
                        c0629Gj = this.A06.A06.get(c0634Go.A00);
                        if (c0629Gj == null) {
                            c0636Gq = this.A06;
                            strArr3 = A08;
                            if (strArr3[6].charAt(3) != strArr3[3].charAt(3)) {
                                String[] strArr14 = A08;
                                strArr14[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
                                strArr14[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            } else {
                                c0629Gj = c0636Gq.A04.get(c0634Go.A00);
                                if (c0629Gj == null) {
                                    c0629Gj = this.A04;
                                }
                            }
                        }
                    }
                    sparseArray = c0634Go.A09;
                    i3 = 0;
                    while (true) {
                        size = sparseArray.size();
                        if (A08[2].charAt(23) != 'o') {
                            A08[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
                            if (i3 < size) {
                                iKeyAt = sparseArray.keyAt(i3);
                                c0635GpValueAt = sparseArray.valueAt(i3);
                                c0631Gl = this.A06.A07.get(iKeyAt);
                                if (c0631Gl == null) {
                                    c0631Gl = this.A06.A05.get(iKeyAt);
                                }
                                if (c0631Gl == null) {
                                    if (c0631Gl.A01) {
                                        paint = null;
                                    } else {
                                        paint = this.A02;
                                    }
                                    A0B(c0631Gl, c0629Gj, c0634Go.A01, objectId + c0635GpValueAt.A02, i2 + c0635GpValueAt.A05, paint, this.A01);
                                }
                                i3++;
                            }
                        }
                    }
                    if (!c0634Go.A0A) {
                        if (c0634Go.A01 == 3) {
                            i4 = c0629Gj.A03[c0634Go.A07];
                        } else if (c0634Go.A01 == 2) {
                            i4 = c0629Gj.A02[c0634Go.A06];
                        } else {
                            iArr = c0629Gj.A01;
                            strArr2 = A08;
                            if (strArr2[4].charAt(19) != strArr2[0].charAt(19)) {
                                i4 = iArr[c0634Go.A05];
                            } else {
                                String[] strArr15 = A08;
                                strArr15[1] = "SK7qwpqeD";
                                strArr15[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
                                i4 = iArr[c0634Go.A05];
                            }
                        }
                        this.A03.setColor(i4);
                        this.A01.drawRect(objectId, i2, c0634Go.A08 + objectId, c0634Go.A02 + i2, this.A03);
                    }
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.A00, objectId, i2, c0634Go.A08, c0634Go.A02);
                    float f5 = objectId / displayDefinition.A05;
                    float f6 = i2 / displayDefinition.A00;
                    float f7 = c0634Go.A08 / displayDefinition.A05;
                    int color3 = c0634Go.A02;
                    float f8 = color3;
                    int color4 = displayDefinition.A00;
                    arrayList.add(new GX(bitmapCreateBitmap2, f5, 0, f6, 0, f7, f8 / color4));
                    this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
                    i5++;
                }
            }
            return arrayList;
        }
        throw new RuntimeException();
    }

    public final void A0J() {
        this.A06.A00();
    }
}

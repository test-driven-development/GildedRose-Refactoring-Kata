package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@UseReporter(JunitReporter.class)
public class GildedRoseTest {

  @Test
  public   void updateQuality() {
    Item[] items = new Item[] {new Item("foo", 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals("foo", app.items[0].name);
    Approvals.verify(app.items[0].name);
  }
}

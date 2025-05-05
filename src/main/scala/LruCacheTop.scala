import chisel3._
import chisel3.util._

class LruCacheTop() extends Module {

}

object main extends App {
  (new chisel3.stage.ChiselStage).emitVerilog(new LruCacheTop(), Array("--target-dir", "generated", "--no-dedup"))
}

